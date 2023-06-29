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
public class MessageRequest implements Serializable {

    @Serial
    private final static long serialVersionUID = 2996938444556227501L;

    private String channelId;
    private String message;
    private String user;
}
