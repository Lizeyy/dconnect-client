package com.dconnect.client.protocol.domain.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServerCreateRequest implements Serializable {
    @Serial
    private final static long serialVersionUID = 4712254128906334239L;

    @NotNull
    private String serverId;

    @NotNull
    private String creationBy;
}
