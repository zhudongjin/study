package com.gold.common.error;

/**
 * 作者：gold.zhu
 * 创建时间：10点21分
 * 备注：异常编码接口
 */
public interface ErrorCodeType {

    String getCode();

    String getMessage();

    ErrorCode toErrorCode(Object... args);
}
