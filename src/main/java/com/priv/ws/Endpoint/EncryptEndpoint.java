package com.priv.ws.Endpoint;

import me.priv.ws_mk.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EncryptEndpoint {
    private static final String NAMESPACE_URI = "http://priv.me/ws-mk";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEncryptRequest")
    @ResponsePayload
    public GetEncryptResponse getEncryptResponse(@RequestPayload GetEncryptRequest r){
        GetEncryptResponse rs = new GetEncryptResponse();

        System.out.println("Phrase : " + r.getPhrase());
        System.out.println("key : " + r.getKey());

        return rs;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getGenSHAKeyRequest")
    @ResponsePayload
    public GetGenSHAKeyResponse getGenSHAKeyRequest(@RequestPayload GetGenSHAKeyRequest r){
        GetGenSHAKeyResponse rs = new GetGenSHAKeyResponse();

        System.out.println( "Phrase: " + r.getPhrase());
        System.out.println( "Date: " + r.getDate());
        System.out.println( "Issuer: " + r.getIssuer());
        System.out.println( "Long: " + r.getLong());
        System.out.println( "Public: " + r.getPublic());
        System.out.println( "Key: " + r.getKey() );

        return rs;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getGenSHAKeyConfigurationSetterRequest")
    @ResponsePayload
    public GetGenSHAKeyConfigurationSetterResponse getGenSHAKeyConfigurationSetterRequest(@RequestPayload GetGenSHAKeyConfigurationSetterRequest r){
        GetGenSHAKeyConfigurationSetterResponse rs = new GetGenSHAKeyConfigurationSetterResponse();

        System.out.println( r.getMail() );


        return rs;
    }

}