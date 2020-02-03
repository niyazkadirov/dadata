package com.example.dadata.service;

import com.example.dadata.API.DadataApi;
import com.example.dadata.domain.Dadata;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadataService {
    private static final String REGION_KLADR_ID = "regionkladrid";
    private static final String REGION_FIAS_ID = "regionfiasid";
    private static final String REGION = "region";


    @Autowired
    private DadataApi dadataApi;

    /**
     * @return возвращает экземляр класса Dadata, где описан POJO
     * с JSON структурой, приходящей от сервера API
     */
    @SuppressWarnings("unchecked")
    public <T> T getInfoByParam(String location, String param) {
        Gson gson = new Gson();


        Dadata.Data data = dadataApi
                .DadataClient(location)
                .getSuggestions()
                .iterator()
                .next()
                .getData();


        //For example
        switch (param.toLowerCase()) {

            case (REGION_KLADR_ID):
                return (T) gson.toJson(data.getRegionKladrId());

            case (REGION):
                return (T) gson.toJson(data.getRegion());

            case (REGION_FIAS_ID):
                return (T) gson.toJson(data.getRegionFiasId());
            //.....
            default:
                return (T) data;
        }
    }


    @SuppressWarnings("unchecked")
    public <T> T getAllParam(String location) {
        return (T) dadataApi.DadataClient(location)
                .getSuggestions()
                .iterator()
                .next()
                .getData();
    }
}
