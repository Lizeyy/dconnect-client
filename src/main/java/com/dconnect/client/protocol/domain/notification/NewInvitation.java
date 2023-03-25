package com.dconnect.client.protocol.domain.notification;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class NewInvitation extends PrivateMessage {

    private Long connectionId;
    private String connectionName;
    private String serverId;
    private String iconUrl;
    private String serverName;
    private String invitationId;
    private String createdBy;
    private String createdByName;
    private String serverConnectionOwnerId;
    private LocalDateTime creationDate;
}
