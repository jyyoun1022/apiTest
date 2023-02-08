package org.codej.rest.log;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiTransactionLog {

    private Long logId;
    private String userId;
    private String apiId;
    private String httpMethod;
    private String uri;
    private String httpStatusCd;
    private LocalDateTime regDtm;
    private LocalDateTime resDtm;
    private Long elapsedMs;// 경과ms
    private String reqCntn;
    private String resCntn;
    private String osVer;
    private String hostName;
    private String agentVer;
    private String clientIp;
    private String screentId;
    private String userAgent;
}
