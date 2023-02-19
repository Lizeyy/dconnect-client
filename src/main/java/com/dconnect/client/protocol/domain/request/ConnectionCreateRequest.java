package com.dconnect.client.protocol.domain.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConnectionCreateRequest implements Serializable {
    @Serial
    private final static long serialVersionUID = 7502498122339836740L;

    @NotNull
    private String name;

    @NotNull
    private String creationBy;

    @NotNull
    private String serverId;

    @NotNull
    private String channelId;
}
