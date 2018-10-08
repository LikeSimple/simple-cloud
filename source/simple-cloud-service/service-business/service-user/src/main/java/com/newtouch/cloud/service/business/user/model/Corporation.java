package com.newtouch.cloud.service.business.user.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Corporation implements Serializable {
    private String id;

    private String name;

    private String type;

    private String nodeLevel;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 4166279164249644485L;
}