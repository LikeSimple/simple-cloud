package com.newtouch.cloud.service.business.auth.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Vector;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
public class UserDetails implements Serializable, org.springframework.security.core.userdetails.UserDetails {

    private String id;

    private String username;

    private String password;

    private Boolean locked;

    private Boolean enabled;

    private Date accountExpire;

    private Date credentialExpire;

    private static final long serialVersionUID = 7269203591143264368L;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return new Vector<>();
    }

    @Override
    public boolean isAccountNonExpired() {
        return null != accountExpire && accountExpire.after(new Date());
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return null != accountExpire && accountExpire.after(new Date());
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}