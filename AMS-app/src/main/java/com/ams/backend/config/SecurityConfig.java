package com.ams.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

@Configuration
public class SecurityConfig {

    @Bean
    public FilterRegistrationBean<FirebaseTokenFilter> firebaseFilter(
            FirebaseTokenFilter filter) {

        FilterRegistrationBean<FirebaseTokenFilter> registration =
                new FilterRegistrationBean<>();

        registration.setFilter(filter);
        registration.addUrlPatterns("/*");

        return registration;
    }
}
