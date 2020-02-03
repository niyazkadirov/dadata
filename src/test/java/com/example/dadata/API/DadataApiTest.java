package com.example.dadata.API;

import com.example.dadata.config.AppProperties;
import com.example.dadata.domain.Dadata;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.web.client.RestTemplate;


@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
class DadataApiTest {

    @Autowired
    private AppProperties appProperties;

    @Test
    void responseFromServerShouldBe200OK() {

        String location = "казань";
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set(HttpHeaders.AUTHORIZATION, appProperties.getTokenPrefix() + " " + appProperties.getToken());

        String requestJson = "{\"query\":\"" + location + "\"}";
        HttpEntity<String> entity =
                new HttpEntity<>(requestJson, headers);

        ResponseEntity<Dadata> dadataResponseEntity =
                restTemplate.postForEntity(appProperties.getUrl(), entity, Dadata.class);

        Assert.assertEquals(200, dadataResponseEntity.getStatusCodeValue());
    }


}