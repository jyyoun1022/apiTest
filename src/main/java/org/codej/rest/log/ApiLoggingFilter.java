package org.codej.rest.log;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import java.io.IOException;

/** Interceptor 에서 Request,response content body 내용을 읽어오기 위한 Filter
 * HttpServletRequeset, HttpServletResponse의 경우 한번 읽으면 다시 읽지 못함
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class ApiLoggingFilter extends OncePerRequestFilter {

    private final static String[] excludeUri = {"/"};
    private final static String[] excludeHttpMethods = {"OPTIONS"};
    private final ApiLogRecorder apiLogRecorder;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        // 예외
        if (ArrayUtils.contains(excludeUri,request.getRequestURI()) || ArrayUtils.contains(excludeHttpMethods,request.getMethod())) {
            filterChain.doFilter(request,response);
            return;
        }
        if (log.isDebugEnabled()) {
            log.debug("ApiLogging : {} {} Content-Type : {}",request.getMethod(),request.getRequestURI(),request.getContentType());
        }
        long startTime = System.currentTimeMillis();

        ContentCachingRequestWrapper wrappingRequest = new ContentCachingRequestWrapper(request, ApiLogRecorder.REQUEST_CONTENT_LIMIT);
        ContentCachingResponseWrapper wrappingResponse = new ContentCachingResponseWrapper(response);
        // ContentCachingRequestWrapper안에있는 ByteArrayOutputStream에 내용을 미리 담아두는데 뒤에서 누가 읽을때 여기 담겨진 내용들을 뒤에서 읽을수 있게 해준다.

        filterChain.doFilter(wrappingRequest,wrappingResponse);
        // 후처리
        long endTime = System.currentTimeMillis();

        Object handler = request.getAttribute("handler");
        Exception ex = (Exception) request.getAttribute("exception");

        ApiTransactionLog trLog = apiLogRecorder.buildApiTransactionLog(wrappingRequest, wrappingResponse, handler, startTime, endTime);
        apiLogRecorder.save(trLog,handler,ex);
        wrappingResponse.copyBodyToResponse();//다시한번 더 바디를 채워준다.
    }
}
