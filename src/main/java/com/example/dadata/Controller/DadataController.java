package com.example.dadata.Controller;

import com.example.dadata.domain.Dadata;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class DadataController {


    @PostMapping("/")
    public Dadata getMovieByTitle() {

        String accessToken = "3690dff6fc202c750c97d780fe333d2c063dadcd";
        final String url = "https://suggestions.dadata.ru/suggestions/api/4_1/rs/suggest/address";
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Token " + accessToken);

        String requestJson = "{\"query\":\"казань\"}";
        HttpEntity<String> entity = new HttpEntity<>(requestJson, headers);
        return restTemplate.postForObject(url, entity, Dadata.class);
    }

}