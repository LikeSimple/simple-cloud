package com.newtouch.cloud.service.business.user.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.newtouch.cloud.service.business.user.model.OauthClientDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth")
public class OauthClientController {

    @GetMapping("/client/{id:\\d+}")
    @JsonView(OauthClientDetails.OauthClientSummary.class)
    public OauthClientDetails getOauthClientDetails(@PathVariable("id") String id) {
        return null;
    }
}
