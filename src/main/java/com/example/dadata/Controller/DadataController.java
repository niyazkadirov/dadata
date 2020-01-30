package com.example.dadata.Controller;

import com.example.dadata.domain.Suggestion;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public Suggestion getMovieByTitle() throws JsonProcessingException {

        String accessToken = "3690dff6fc202c750c97d780fe333d2c063dadcd";
        final String url = "https://suggestions.dadata.ru/suggestions/api/4_1/rs/suggest/address";
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set(HttpHeaders.AUTHORIZATION, "Token " + accessToken);

        String requestJson = "{\"query\":\"казань\"}";
        HttpEntity<String> entity = new HttpEntity<>(requestJson, headers);
        ObjectMapper objectMapper = new ObjectMapper();

        return restTemplate.postForObject(url, entity, Suggestion.class);

//        DadataRequest dadataRequest = objectMapper.readValue(str, DadataRequest.class);
    }

}