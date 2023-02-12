package com.dconnect.client;


import lombok.Generated;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Generated
@Configuration
@EnableFeignClients(clients = InfrastructureRestClient.class)
public class FeignClientInfrastructureConfiguration {

    @Value("${feign.client.config.infrastructure.connectTimeout:300}")
    private Integer connectTimeout;

    @Value("${feign.client.config.infrastructure.readTimeout:300}")
    private Integer readTimeout;

    @Value("${feign.client.config.infrastructure.loggerLevel:basic}")
    private String loggerLevel;
}
