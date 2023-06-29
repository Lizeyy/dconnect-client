package com.dconnect.client;


import lombok.Generated;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Generated
@Configuration
@EnableFeignClients(clients = DiscordRestClient.class)
public class FeignClientDiscordConfiguration {

    @Value("${feign.client.config.discord.connectTimeout:100}")
    private Integer connectTimeout;

    @Value("${feign.client.config.discord.readTimeout:500}")
    private Integer readTimeout;

    @Value("${feign.client.config.discord.loggerLevel:basic}")
    private String loggerLevel;
}
