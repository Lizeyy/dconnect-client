package com.dconnect.client;


import lombok.Generated;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Generated
@Configuration
@EnableFeignClients(clients = InfrastructureRestClient.class)
public class FeignClientInfrastructureConfiguration {

    @Value("${feign.client.config.infrastructure.connectTimeout}")
    private Integer connectTimeout;

    @Value("${feign.client.config.infrastructure.readTimeout}")
    private Integer readTimeout;

    @Value("${feign.client.config.infrastructure.loggerLevel}")
    private String loggerLevel;
}
