package com.dconnect.client;

import com.dconnect.client.protocol.domain.request.ConnectionCreateRequest;
import com.dconnect.client.protocol.domain.request.ConnectionJoinRequest;
import com.dconnect.client.protocol.domain.request.InvitationRequest;
import com.dconnect.client.protocol.domain.request.MessageRequest;
import com.dconnect.client.protocol.domain.response.ConnectionCreateResponse;
import com.dconnect.client.protocol.domain.response.ConnectionListOnServerResponse;
import com.dconnect.client.protocol.domain.response.InvitationResponse;
import com.dconnect.client.protocol.domain.response.ConnectionJoinResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@FeignClient(url = "${feign.client.infrastructure.baseUrl}", name = "dconnect-infrastructure")
public interface InfrastructureRestClient {

    @PostMapping({"/api/connection"})
    ConnectionCreateResponse createConnection(@Valid @RequestBody ConnectionCreateRequest request);

    @PutMapping("/api/connection/join")
    ConnectionJoinResponse joinConnection(@Valid @RequestBody ConnectionJoinRequest request);

    @PostMapping("api/connection/add")
    InvitationResponse addConnection(@Valid @RequestBody InvitationRequest request);

    @PostMapping("api/connection/invitation-delete")
    InvitationResponse removeInvitation(@Valid @RequestBody InvitationRequest request);

    @GetMapping("api/connection/{serverId}")
    ConnectionListOnServerResponse getConnectionListOnServerResponse(@PathVariable("serverId") String serverId);

    @PostMapping("api/message")
    void sendMessage(@Valid @RequestBody MessageRequest mess);
}
