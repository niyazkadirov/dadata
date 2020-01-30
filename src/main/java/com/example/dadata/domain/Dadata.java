package com.example.dadata.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;
import java.time.ZoneId;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dadata  {

    @JsonProperty("region_kladr_id")
    private String regionKladrId;

    public Dadata() {
    }

    public String getRegionKladrId() {
        return regionKladrId;
    }

    public void setRegionKladrId(String regionKladrId) {
        this.regionKladrId = regionKladrId;
    }
}