package com.dconnect.client.protocol.domain.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConnectionJoinResponse implements Serializable {
    @Serial
    private final static long serialVersionUID = 6522483561934602963L;

    private String name;
}
