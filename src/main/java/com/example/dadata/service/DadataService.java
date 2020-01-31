package com.example.dadata.service;

import com.example.dadata.API.DadataApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DadataService {

    @Autowired
    private DadataApi dadataApi;

    public Map<String, String> getInfoByLocation(String location) {
        Map<String, String> map = new HashMap<>();

        dadataApi.DadataClient(location)
                .getSuggestions()
                .forEach(suggestions -> map.put(suggestions.getValue() + " |Код КЛАДР региона ",
                        suggestions.getData().getRegionKladrId()));
        return map;
    }

}
