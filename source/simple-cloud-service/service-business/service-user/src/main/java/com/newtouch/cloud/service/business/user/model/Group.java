package com.newtouch.cloud.service.business.user.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Group implements Serializable {
    private String id;

    private String name;

    private String description;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 4086679929994439438L;
}