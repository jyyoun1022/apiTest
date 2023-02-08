package org.codej.rest.log;

import com.github.javafaker.Internet;
import eu.bitwalker.useragentutils.UserAgent;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Description;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import static com.github.javafaker.Internet.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApiLogRecorder {

    // Request content 캐싱 제한 바이트 수
    public final static Integer REQUEST_CONTENT_LIMIT = 4000;
    public final static Integer RESPONSE_CONTENT_LIMIT = 4000;
    private final static String[] CONTENT_TYPE_TARGETS = {"application/json","application/x-www-form-urlencoded","multipart/form-data"};

    /** 비동기 방식으로 API 입출력 및 에러 로그 기록*/
    @Async // @Async Annotation은 Spring에서 제공하는 Thread Pool을 활용하는 비동기 메소드 지원 Annotation이다.
    public void save(ApiTransactionLog trlog, Object hadnler, Exception ex) {

    }

    public ApiTransactionLog buildApiTransactionLog(HttpServletRequest request, HttpServletResponse response, Object handler, long startTime, long endTime) {
        ApiTransactionLog transactionLog = ApiTransactionLog.builder()
                .apiId(getApiId(handler, request))
                .userId(getUserId(request))
                .httpMethod(request.getMethod())
                .uri(request.getRequestURI())
                .httpStatusCd(String.valueOf(response.getStatus()))
                .regDtm(millsToLocalDateTime(startTime))
                .resDtm(millsToLocalDateTime(endTime))
                .elapsedMs(endTime - startTime)
                .reqCntn(getRequestContentBody(request))
                .resCntn(getResponseContentBody(response))
                .clientIp(HttpRequestUtils.getRemoteIp(request))
                .screentId(getScreenId(request))
                .hostName(getLocalHostName())
                .userAgent(request.getHeader("User-Agent"))
                .build();
        return transactionLog;
    }

    private String getControllerName(Object handler) {
        //Controller
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerHandler = (HandlerMethod) handler;
            return handlerHandler.getMethod().getDeclaringClass().getSimpleName();
        }
        return null;
    }
    private String getMethodName(Object handler) {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerHandler = (HandlerMethod) handler;
            return handlerHandler.getMethod().getName();
        }
        return null;
    }
    private String getApiId(Object handler, HttpServletRequest request) {
        // API ID
        if (handler instanceof HandlerMethod) {
            Description description = ((HandlerMethod)handler).getMethodAnnotation(Description.class);
            if (description != null) {
                return description.value();
            } else if (StringUtils.equals(request.getRequestURI(),"/oauth/token")) {
                return "MEM100002";
            }
        }
        return null;
    }
    private String getUserId(HttpServletRequest request) {
        String userId = request.getRemoteUser();
        return userId == null ? "ANONYMOUS" : userId;
    }
    private String getRequestContentBody(HttpServletRequest request) {
        String requestContents = null;

        // RequestBody(4000 Bytes)
        if (request instanceof ContentCachingRequestWrapper) {
            final ContentCachingRequestWrapper cachingRequest = (ContentCachingRequestWrapper) request;
            if (StringUtils.containsAnyIgnoreCase(cachingRequest.getContentType(), CONTENT_TYPE_TARGETS)) {
                byte[] contentBytes = cachingRequest.getContentAsByteArray();
                if (contentBytes != null  && contentBytes.length != 0) {
                    requestContents = new String(contentBytes);
                    log.info("Request Body ::: {}",requestContents);
                }
            }
        }
        if (StringUtils.isEmpty(requestContents) && StringUtils.equals(request.getMethod(),"GET")) {
            requestContents = request.getQueryString();
        }
        return requestContents;
    }

    private String getResponseContentBody(HttpServletResponse response) {

        // Response body (4000bytes)
        if (response instanceof ContentCachingResponseWrapper) {
            final ContentCachingResponseWrapper cachingResponse = (ContentCachingResponseWrapper) response;

            if (StringUtils.containsAnyIgnoreCase(cachingResponse.getContentType(), CONTENT_TYPE_TARGETS)) {
                byte[] buf = null;
                if (cachingResponse.getContentSize() <= RESPONSE_CONTENT_LIMIT) {
                    buf = cachingResponse.getContentAsByteArray();
                } else {
                    buf = new byte[RESPONSE_CONTENT_LIMIT];
                    try (InputStream is = cachingResponse.getContentInputStream()) {
                        is.read(buf);
                    } catch (IOException e) {
                        log.error(e.getMessage(),e);
                        buf = new byte[0];
                    }
                }
                String responseContents = new String(buf);
                log.info("Response Body ::: {}", responseContents);
                return responseContents;
            }
        }
        return null;
    }

    public LocalDateTime millsToLocalDateTime(long millis) {
        Instant instant = Instant.ofEpochMilli(millis);
        LocalDateTime date = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        return date;
    }

    private String getLocalHostName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            log.error(e.getMessage());
        }
        return null;
    }

    private String getOsVer(UserAgent userAgent) {
        return userAgent.getOperatingSystem().getName();
    }

    private String getAgentVer(UserAgent userAgent) {
        if (userAgent.getBrowserVersion() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(userAgent.getBrowser().getGroup().getName());
            sb.append(" ");
            sb.append(userAgent.getBrowserVersion().getMajorVersion());
            return sb.toString();
        } else {
            return userAgent.getBrowser().getName();
        }
    }

    private String getScreenId(HttpServletRequest request) {
        String screenId = request.getParameter("screenId");
        return screenId;
    }
}
