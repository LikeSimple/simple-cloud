package com.newtouch.cloud.service.business.user.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Group implements Serializable {
    private static final long serialVersionUID = 4086679929994439438L;
    private String id;
    private String name;
    private String description;
    private Date createTime;
    private Date updateTime;
}