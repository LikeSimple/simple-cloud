package com.newtouch.cloud.service.business.user.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class OauthClientDetails implements Serializable {

    private static final long serialVersionUID = 8430482365591710623L;
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
    private String autoApprove;
    private Date createTime;
    private Date updateTime;
    private String additionalInformation;
    public interface OauthClientSummary {
    }
}