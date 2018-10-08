package com.newtouch.cloud.service.business.user.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class User implements Serializable {
    private String id;

    private String username;

    private String password;

    private Boolean locked;

    private Boolean enabled;

    private Date accountExpire;

    private Date credentialExpire;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = -3348934571569107047L;
}