package com.dconnect.client.protocol.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConnectionListOnServerResponse implements Serializable {
    @Serial
    private final static long serialVersionUID = -5126387785339817016L;

    private String serverName;
    private Map<String, String> connections;
}
