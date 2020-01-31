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

    public String getInfoByLocation(String location) {
        
        return dadataApi.DadataClient(location).getSuggestions().iterator().next().getData().getRegionKladrId();
    }

}
