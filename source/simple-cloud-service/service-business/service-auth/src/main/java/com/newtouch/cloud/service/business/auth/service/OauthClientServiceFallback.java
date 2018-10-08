package com.newtouch.cloud.service.business.auth.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.provider.ClientDetails;

@Slf4j
public class OauthClientServiceFallback implements OauthClientService{
    @Override
    public ClientDetails getClientById(String clientId) {
        log.error("call service-user's method {} failed.", "getClientById");
        return null;
    }
}
