package com.newtouch.cloud.service.business.user.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class GroupAuthority implements Serializable {
    private static final long serialVersionUID = 5241016651914315348L;
    private String groupId;
    private String authorityId;
}