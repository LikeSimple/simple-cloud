package com.newtouch.cloud.service.business.auth.config;

import com.newtouch.cloud.service.business.auth.mapper.UserDetailsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.Assert;

@Configuration
@Slf4j
public class UserDetailsServiceConfiguration {

    private final UserDetailsMapper userDetailsMapper;

    public UserDetailsServiceConfiguration(UserDetailsMapper userDetailsMapper) {
        this.userDetailsMapper = userDetailsMapper;
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsServiceImpl(userDetailsMapper);
    }

    public static class UserDetailsServiceImpl implements UserDetailsService {
        private final UserDetailsMapper userDetailsMapper;

        UserDetailsServiceImpl(UserDetailsMapper userDetailsMapper) {
            this.userDetailsMapper = userDetailsMapper;
        }

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            UserDetails userDetails = null;
            try {
                userDetails = userDetailsMapper.selectByUsername(username);
                Assert.notNull(userDetails, String.format("user[%s] not found.", username));
            } catch (Exception e) {
                log.info(e.getMessage());
                throw new UsernameNotFoundException(e.getMessage());
            }
            return userDetails;
        }

    }

}
