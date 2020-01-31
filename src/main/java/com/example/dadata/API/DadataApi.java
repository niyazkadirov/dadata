package com.example.dadata.API;

import com.example.dadata.domain.Dadata;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class DadataApi {
    public final String ACCESS_TOKEN = "3690dff6fc202c750c97d780fe333d2c063dadcd";
    public final String URL = "https://suggestions.dadata.ru/suggestions/api/4_1/rs/suggest/address";
    public final String TOKEN_PREFIX = "Token ";


    public Dadata DadataClient(String location) {


        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set(HttpHeaders.AUTHORIZATION, TOKEN_PREFIX + ACCESS_TOKEN);
        String requestJson = "{\"query\":\"" + location + "\"}";
        HttpEntity<String> entity = new HttpEntity<>(requestJson, headers);
        return restTemplate.postForObject(URL, entity, Dadata.class);
    }
}
