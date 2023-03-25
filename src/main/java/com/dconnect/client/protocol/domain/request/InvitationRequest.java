package com.dconnect.client.protocol.domain.request;

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
public class InvitationRequest implements Serializable {

    @Serial
    private final static long serialVersionUID = -2319299798509927626L;

    private String invitationId;
}
