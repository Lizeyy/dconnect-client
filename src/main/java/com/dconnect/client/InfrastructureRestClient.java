package com.dconnect.client;

import com.dconnect.client.protocol.domain.request.ConnectionCreateRequest;
import com.dconnect.client.protocol.domain.response.ConnectionCreateResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@FeignClient("dconnect-infrastructure")
public interface InfrastructureRestClient {

    @PostMapping({"/api/connection"})
    ConnectionCreateResponse createConnection(@Valid @RequestBody ConnectionCreateRequest request);
}
