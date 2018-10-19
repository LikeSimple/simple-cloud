package com.newtouch.cloud.service.business.user.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserGroup implements Serializable {
    private static final long serialVersionUID = 2969303696531468923L;
    private String userId;
    private String groupId;
}