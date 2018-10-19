package com.newtouch.cloud.service.business.common.web;

import com.newtouch.cloud.service.business.common.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;

@Slf4j
public class BaseRestController {

    public User getCurrentUser() throws SecurityException {

        User currentUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (null == currentUser) {
            throw new SecurityException("current user is not exist!");
        } else {
            return currentUser;
        }

    }
}
