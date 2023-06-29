package com.dconnect.client.protocol.domain.response;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class UserInfo implements Serializable {

    @Serial
    private final static long serialVersionUID = -6843521996569110189L;

    private String id;
    private String username;
    private String avatar;

}
