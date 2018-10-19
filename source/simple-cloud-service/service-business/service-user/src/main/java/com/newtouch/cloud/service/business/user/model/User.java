package com.newtouch.cloud.service.business.user.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = -3348934571569107047L;
    private String id;
    private String username;
    private String password;
    private Boolean locked;
    private Boolean enabled;
    private Date accountExpire;
    private Date credentialExpire;
    private Date createTime;
    private Date updateTime;
}