package com.dconnect.client;

import com.dconnect.client.protocol.domain.response.ChannelInfo;
import com.dconnect.client.protocol.domain.response.ServerInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "${feign.client.discord.baseUrl}", name = "dconnect-discord")
public interface DiscordRestClient {

    @GetMapping("/api/discord/server/{id}")
    ServerInfo getServerInfo(@PathVariable("id") String serverId);

    @GetMapping("/api/discord/channel/{id}")
    ChannelInfo getChannelInfo(@PathVariable("id") String channelId);
}
