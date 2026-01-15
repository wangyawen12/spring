package org.example.demospring2.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan({"org.example.demospring2"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AOPConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
