package com.dconnect.client.protocol.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConnectionQuitResponse implements Serializable {
    @Serial
    private final static long serialVersionUID = 5468538430624478881L;

    private String connectionName;
    private String serverName;
}
