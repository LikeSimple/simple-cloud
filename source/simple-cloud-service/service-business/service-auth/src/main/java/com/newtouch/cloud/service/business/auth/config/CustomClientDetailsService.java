package com.newtouch.cloud.service.business.auth.config;

import com.newtouch.cloud.service.business.auth.service.OauthClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;

@Slf4j
public class CustomClientDetailsService implements ClientDetailsService {

    private OauthClientService oauthClientService;

    public CustomClientDetailsService(OauthClientService oauthClientService) {
        this.oauthClientService = oauthClientService;
    }

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        ClientDetails clientDetails ;
        try {
            clientDetails = oauthClientService.getClientById(clientId);
        } catch (Exception e) {
            log.error(String.format("can't get oauth client info by clientId: %s", clientId));
            throw new ClientRegistrationException(e.getMessage());
        }
        return clientDetails;
    }
}
