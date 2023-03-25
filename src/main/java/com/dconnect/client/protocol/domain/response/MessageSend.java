package com.dconnect.client.protocol.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageSend implements Serializable {

    @Serial
    private final static long serialVersionUID = 2499116276619026281L;

    private Set<String> channelsId;
    private String userId;
    private String channelRoot;
    private String serverRoot;
    private String message;

}
