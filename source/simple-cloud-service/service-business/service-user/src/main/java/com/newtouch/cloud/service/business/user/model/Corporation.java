package com.newtouch.cloud.service.business.user.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Corporation implements Serializable {
    private static final long serialVersionUID = 4166279164249644485L;
    private String id;
    private String name;
    private String type;
    private String nodeLevel;
    private Date createTime;
    private Date updateTime;
}