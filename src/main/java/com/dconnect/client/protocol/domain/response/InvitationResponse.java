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
public class InvitationResponse implements Serializable {

    @Serial
    private final static long serialVersionUID = -9217861589229754033L;

    private String connectionName;
    private String serverName;

}
