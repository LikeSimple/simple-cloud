package com.newtouch.cloud.service.business.user.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UserProfile implements Serializable {
    private String userId;

    private String realName;

    private String avatar;

    private String sex;

    private Integer age;

    private String mobile;

    private String email;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = -5688341297553137050L;
}