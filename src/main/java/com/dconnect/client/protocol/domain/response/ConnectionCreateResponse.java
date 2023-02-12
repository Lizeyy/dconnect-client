package com.dconnect.client.protocol.domain.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConnectionCreateResponse {
    private final static long serialVersionUID = -5126387785339817016L;

    private String name;
}
