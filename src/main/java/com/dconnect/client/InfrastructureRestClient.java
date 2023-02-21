package com.dconnect.client;

import com.dconnect.client.protocol.domain.request.ConnectionCreateRequest;
import com.dconnect.client.protocol.domain.request.ConnectionJoinRequest;
import com.dconnect.client.protocol.domain.response.ConnectionCreateResponse;
import com.dconnect.client.protocol.domain.response.ConnectionJoinResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@FeignClient(url = "${feign.client.infrastructure.baseUrl}", name = "dconnect-infrastructure")
public interface InfrastructureRestClient {

    @PostMapping({"/api/connection"})
    ConnectionCreateResponse createConnection(@Valid @RequestBody ConnectionCreateRequest request);

    @PutMapping("/api/connection/join")
    ConnectionJoinResponse joinConnection(@Valid @RequestBody ConnectionJoinRequest request);
}
