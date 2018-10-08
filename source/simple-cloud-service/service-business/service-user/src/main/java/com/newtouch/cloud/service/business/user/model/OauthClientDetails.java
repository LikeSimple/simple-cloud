package com.newtouch.cloud.service.business.user.model;

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

    private Boolean archived;

    private Boolean trusted;

    private String autoapprove;

    private Date createTime;

    private Date updateTime;

    private String additionalInformation;

    private static final long serialVersionUID = 8430482365591710623L;
}