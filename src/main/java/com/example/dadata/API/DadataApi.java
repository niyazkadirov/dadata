package com.example.dadata.API;

import com.example.dadata.config.AppProperties;
import com.example.dadata.domain.Dadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class DadataApi {
    public final String TOKEN_PREFIX = "Token ";


    @Autowired
    private AppProperties appProperties;

    public Dadata DadataClient(String location) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set(HttpHeaders.AUTHORIZATION, appProperties.getTokenPrefix() + " " + appProperties.getToken());
        String requestJson = "{\"query\":\"" + location + "\"}";
        HttpEntity<String> entity = new HttpEntity<>(requestJson, headers);
        return restTemplate.postForObject(appProperties.getUrl(), entity, Dadata.class);
    }
}
