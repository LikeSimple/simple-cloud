package com.newtouch.cloud.service.business.user.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class UserPosition implements Serializable {
    private String userId;

    private String positionId;

    private static final long serialVersionUID = -5204675331956763699L;
}