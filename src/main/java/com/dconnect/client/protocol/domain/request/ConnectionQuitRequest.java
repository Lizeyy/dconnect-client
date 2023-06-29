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
public class ConnectionQuitRequest implements Serializable {
    @Serial
    private final static long serialVersionUID = -821768503787612226L;

    @NotNull
    private String channelId;

    @NotNull
    private String creationBy;

    @NotNull
    private String serverId;
}
