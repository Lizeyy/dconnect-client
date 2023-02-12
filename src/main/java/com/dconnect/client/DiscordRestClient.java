package com.dconnect.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "${feign.client.discord.baseUrl}", name = "discord")
public interface DiscordRestClient {
}
