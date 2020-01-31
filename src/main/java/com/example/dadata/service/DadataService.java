package com.example.dadata.service;

import com.example.dadata.API.DadataApi;
import com.example.dadata.domain.Dadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadataService {
    private static final String REGION_KLADR_ID = "regionkladrid";
    private static final String REGION_FIAS_ID = "regionfiasid";
    private static final String REGION = "region";


    @Autowired
    private DadataApi dadataApi;


    @SuppressWarnings("unchecked")
    public <T> T getInfoByLocation(String location, String param) {

        Dadata.Data data = dadataApi
                .DadataClient(location)
                .getSuggestions()
                .iterator()
                .next()
                .getData();


        //For example
        switch (param.toLowerCase()) {

            case (REGION_KLADR_ID):
                return (T) data.getRegionKladrId();

            case (REGION):
                return (T) data.getRegion();

            case (REGION_FIAS_ID):
                return (T) data.getRegionFiasId();

            //.....

            default:
                return (T) dadataApi.DadataClient(location).getSuggestions().iterator().next().getData();
        }
    }

}
