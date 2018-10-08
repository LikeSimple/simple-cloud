package com.newtouch.cloud.service.business.user.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class UserGroup implements Serializable {
    private String userId;

    private String groupId;

    private static final long serialVersionUID = 2969303696531468923L;
}