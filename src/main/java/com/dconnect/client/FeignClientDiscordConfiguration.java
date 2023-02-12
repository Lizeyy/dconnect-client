package com.dconnect.client;


import lombok.Generated;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Generated
@Configuration
@EnableFeignClients(clients = DiscordRestClient.class)
public class FeignClientDiscordConfiguration {

    @Value("${feign.client.config.discord.connectTimeout}")
    private Integer connectTimeout;

    @Value("${feign.client.config.discord.readTimeout}")
    private Integer readTimeout;

    @Value("${feign.client.config.discord.loggerLevel}")
    private String loggerLevel;
}
