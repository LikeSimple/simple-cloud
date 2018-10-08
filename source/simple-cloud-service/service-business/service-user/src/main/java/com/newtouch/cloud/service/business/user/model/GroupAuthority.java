package com.newtouch.cloud.service.business.user.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class GroupAuthority implements Serializable {
    private String groupId;

    private String authorityId;

    private static final long serialVersionUID = 5241016651914315348L;
}