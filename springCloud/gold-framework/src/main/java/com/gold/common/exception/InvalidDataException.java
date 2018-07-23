package com.gold.common.exception;

import com.gold.common.error.ErrorCode;

/**
 * 作者：gold.zhu
 * 创建时间：10点21分
 * 备注：无效数据异常，接收到此异常后，直接返回null对象
 */
public class InvalidDataException extends BusinessException {
    // 错误信息
    private ErrorCode errorCode;

    public InvalidDataException() {
        this.errorCode = ErrorCode.error();
    }

    public InvalidDataException(Throwable cause) {
        super(cause);
        this.errorCode = ErrorCode.error();
    }

    public InvalidDataException(ErrorCode errorCode) {
        super(errorCode);
        this.errorCode = errorCode;
    }

    public InvalidDataException(ErrorCode errorCode, Throwable cause) {
        super(errorCode, cause);
        this.errorCode = errorCode;
    }

    public InvalidDataException(String code, String message, Throwable cause) {
        super(code, message, cause);
        this.errorCode = ErrorCode.create(code, message);
    }
}
