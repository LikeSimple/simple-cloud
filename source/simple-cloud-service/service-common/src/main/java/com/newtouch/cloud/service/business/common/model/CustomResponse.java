package com.newtouch.cloud.service.business.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomResponse<T> {

    private int code;

    private T data;
}
