package com.newtouch.cloud.service.business.auth.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-user", fallback = OauthClientServiceFallback.class)
public interface OauthClientService {

    @GetMapping("/oauth-client/{clientId}")
    ClientDetails getClientById(String clientId);
}
