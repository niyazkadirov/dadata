package com.example.dadata.controller;

import com.example.dadata.API.DadataApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DadataController {

    @GetMapping("/{location}")
    public Map<String, String> getLocation(@PathVariable("location") String location) {
        DadataApi api = new DadataApi();

        Map<String, String> map = new HashMap<>();

        api.DadataClient(location)
                .getSuggestions()
                .forEach(suggestions -> map.put(suggestions.getValue() + " |Код КЛАДР региона ",
                        suggestions.getData().getRegionKladrId()));
        return map;
    }
}