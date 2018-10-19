package com.newtouch.cloud.service.business.user.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserProfile implements Serializable {
    private static final long serialVersionUID = -5688341297553137050L;
    private String userId;
    private String realName;
    private String avatar;
    private String sex;
    private Integer age;
    private String mobile;
    private String email;
    private Date createTime;
    private Date updateTime;
}