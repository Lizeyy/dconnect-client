package com.dconnect.client;

import com.dconnect.client.protocol.domain.notification.NewInvitation;
import com.dconnect.client.protocol.domain.response.ChannelInfo;
import com.dconnect.client.protocol.domain.response.ServerInfo;
import com.dconnect.client.protocol.domain.response.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@FeignClient(url = "${feign.client.discord.baseUrl}", name = "dconnect-discord")
public interface DiscordRestClient {

    @GetMapping("/api/discord/server/{id}")
    ServerInfo getServerInfo(@PathVariable("id") String serverId);

    @GetMapping("/api/discord/channel/{id}")
    ChannelInfo getChannelInfo(@PathVariable("id") String channelId);

    @GetMapping("/api/discord/user/{id}")
    UserInfo getUserInfo(@PathVariable("id") String userId);

    @PostMapping("/api/notification/private/new-invitation")
    void sendPrivateNotification(@Valid @RequestBody NewInvitation message);
}
