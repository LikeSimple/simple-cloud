package com.newtouch.cloud.service.business.user.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Department implements Serializable {
    private String id;

    private String corporationId;

    private String name;

    private String nodeLevel;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = -6078452103804015108L;
}