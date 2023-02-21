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
public class ConnectionJoinRequest implements Serializable {
    @Serial
    private final static long serialVersionUID = 4044031636496895942L;

    @NotNull
    private String token;

    @NotNull
    private String creationBy;

    @NotNull
    private String serverId;

    @NotNull
    private String channelId;
}
