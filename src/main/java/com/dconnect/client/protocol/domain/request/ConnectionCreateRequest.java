package com.dconnect.client.protocol.domain.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConnectionCreateRequest {
    private final static long serialVersionUID = 7502498122339836740L;

    @NotNull
    private String name;

    @NotNull
    private String creationBy;

    private boolean conPrivate;

    @NotNull
    private String serverId;

    @NotNull
    private String channelId;
}
