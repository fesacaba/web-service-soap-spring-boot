package com.example.sample;

import com.example.soap.GetExampleRequest;
import com.example.soap.GetExampleResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ListUsersEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/soap";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetExampleRequest")
    @ResponsePayload
    public GetExampleResponse getExample(@RequestPayload GetExampleRequest request) {
        System.out.println("Received ID: " + request.getId());

        GetExampleResponse response = new GetExampleResponse();
        response.setMessage("Received ID: " + request.getId());

        return response;
    }
}
