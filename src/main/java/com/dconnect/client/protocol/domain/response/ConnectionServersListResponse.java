package com.dconnect.client.protocol.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConnectionServersListResponse implements Serializable {
    @Serial
    private final static long serialVersionUID = 2361932388355782851L;

    private String connectionName;
    private Map<String, String> servers;
}
