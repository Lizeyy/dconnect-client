package com.dconnect.client.protocol.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DiscordApiPath {
    public final static String GET_SERVER = "https://discord.com/api/guilds/";
    public final static String GET_CHANNEL = "https://discord.com/api/channels/";
    public final static  String GET_USER = "https://discord.com/api/users/";
}
