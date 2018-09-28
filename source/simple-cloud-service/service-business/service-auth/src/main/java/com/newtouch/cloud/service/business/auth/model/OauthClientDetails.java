package com.newtouch.cloud.service.business.auth.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class OauthClientDetails implements Serializable {
    private String clientId;

    private String resourceIds;

    private String clientSecret;

    private String scope;

    private String authorizedGrantTypes;

    private String webServerRedirectUri;

    private String authorities;

    private Integer accessTokenValidity;

    private Integer refreshTokenValidity;

    private Date createTime;

    private Boolean archived;

    private Boolean trusted;

    private String autoapprove;

    private String additionalInformation;

    private static final long serialVersionUID = 5716454462505547811L;
}