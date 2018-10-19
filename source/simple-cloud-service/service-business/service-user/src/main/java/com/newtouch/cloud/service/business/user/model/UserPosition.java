package com.newtouch.cloud.service.business.user.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserPosition implements Serializable {
    private static final long serialVersionUID = -5204675331956763699L;
    private String userId;
    private String positionId;
}