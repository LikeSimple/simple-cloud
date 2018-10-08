package com.newtouch.cloud.service.business.user.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Position implements Serializable {
    private String id;

    private String departmentId;

    private String name;

    private String nodeLevel;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 805715529933825667L;
}