package com.gold.common;

import lombok.Data;

/**
 * 作者：gold.zhu
 * 创建时间：10点21分
 * 备注：http请求信息
 */
@Data
public class HttpInfo {

    /** 请求唯一序号 */
    private String msgNo;
    /** 请求开始记录时间戳 */
    private long startTime;
    /** 客户端IP */
    private String clientIp;
    /** 客户端host */
    private String clientHost;
}
