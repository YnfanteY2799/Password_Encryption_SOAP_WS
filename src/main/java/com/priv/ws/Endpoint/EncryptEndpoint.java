package com.priv.ws.Endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import me.priv.ws_mk.GetEncryptRequest;
import me.priv.ws_mk.GetEncryptResponse;

@Endpoint
public class EncryptEndpoint {
    private static final String NAMESPACE_URI = "http://priv.me/ws-mk";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEncryptRequest")
    @ResponsePayload
    public GetEncryptResponse getEncryptResponse(@RequestPayload GetEncryptRequest request){
        GetEncryptResponse response = new GetEncryptResponse();




        return response;
    }

}