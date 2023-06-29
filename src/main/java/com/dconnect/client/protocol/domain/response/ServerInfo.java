package com.dconnect.client.protocol.domain.response;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class ServerInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = -4037703942018693704L;

    private String id;
    private String name;
    private String owner_id;
    private String icon;
}
