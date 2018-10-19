package com.newtouch.cloud.service.business.user.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Authority implements Serializable {
    private static final long serialVersionUID = -1196403050166465675L;
    private String id;
    private String name;
    private String description;
    private Date createTime;
    private Date updateTime;
}