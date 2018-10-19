package com.newtouch.cloud.service.business.common.exception;

public class BusinessException extends Exception {

    protected BusinessException() {
        super();
    }

    private BusinessException(String message) {
        super(message);
    }
}
