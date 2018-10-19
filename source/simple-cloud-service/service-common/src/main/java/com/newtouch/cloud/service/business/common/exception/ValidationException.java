package com.newtouch.cloud.service.business.common.exception;

public class ValidationException extends Exception {

    protected ValidationException() {
        super();
    }

    public ValidationException(String messsage) {
        super(messsage);
    }

}
