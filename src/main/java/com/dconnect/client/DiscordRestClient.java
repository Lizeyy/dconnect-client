package com.dconnect.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "${feign.client.discord.baseUrl}", name = "dconnect-discord")
public interface DiscordRestClient {
}
