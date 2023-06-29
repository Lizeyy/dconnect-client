package com.dconnect.client.protocol.domain.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConnectionCreateResponse implements Serializable {
    @Serial
    private final static long serialVersionUID = -5126387785339817016L;

    private String name;
    private String joinToken;
}
