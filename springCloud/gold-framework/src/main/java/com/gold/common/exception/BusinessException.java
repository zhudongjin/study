package com.gold.common.exception;


import com.gold.common.error.ErrorCode;
import com.gold.common.error.IError;

/**
 * 作者：gold.zhu
 * 创建时间：10点21分
 * 备注：业务异常类
 */
public class BusinessException extends RuntimeException implements IError {

    private static final long serialVersionUID = 1L;

    // 错误信息
    private ErrorCode errorCode;

    public BusinessException() {
        this.errorCode = ErrorCode.error();
    }

    public BusinessException(Throwable cause) {
        super(cause);
        this.errorCode = ErrorCode.error();
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public BusinessException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getMessage(), cause);
        this.errorCode = errorCode;
    }

    public BusinessException(String code, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = ErrorCode.create(code, message);
    }

    @Override
    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
