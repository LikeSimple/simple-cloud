package com.newtouch.cloud.service.business.common.web;

import com.newtouch.cloud.service.business.common.model.CustomResponse;
import com.newtouch.cloud.service.business.common.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.ServletRequest;
import java.security.Principal;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public CustomResponse<String> defaultExceptionHandler(Principal principal, HandlerMethod method, ServletRequest request, Exception e) {

        if (log.isDebugEnabled()) {
            log.debug("[User] {}", principal);
            log.debug("[Request] {}", request);
            log.debug("[Method] {}", method);
            e.printStackTrace();
        }

        log.error("[Unknown {}:{}]{} {}", null == principal ? "NoN" : ((User) principal).getId(), null == principal ? "NoN" : ((User) principal).getName(), method.toString(), e.getMessage());
        return new CustomResponse<>(1, e.getMessage());
    }

}
