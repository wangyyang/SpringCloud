package com.example.cloud.orders.config;

import com.example.cloud.commons.aspect.RetAspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class BasicConfig {
    @Autowired
    private Environment env;

    /**
     * 返回值处理
     */
    @Bean
    public RetAspect retAspect() {
        return new RetAspect();
    }
}
