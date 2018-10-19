package com.newtouch.cloud.service.business.user.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Department implements Serializable {
    private static final long serialVersionUID = -6078452103804015108L;
    private String id;
    private String corporationId;
    private String name;
    private String nodeLevel;
    private Date createTime;
    private Date updateTime;
}