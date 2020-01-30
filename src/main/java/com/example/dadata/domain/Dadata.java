package com.example.dadata.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @see <a href="https://confluence.hflabs.ru/pages/viewpage.action?pageId=204669103">Dadata address object</a>
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dadata {

    private Suggestions[] suggestions;

    public Dadata() {
    }

    public Suggestions[] getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(Suggestions[] suggestions) {
        this.suggestions = suggestions;
    }

    public static class Metro {

    }

    public static class Data {

        @JsonAlias("country")
        private String country;
        @JsonAlias("region_kladr_id")
        private String regionKladrId;

        public String getRegionKladrId() {
            return regionKladrId;
        }

        public void setRegionKladrId(String regionKladrId) {
            this.regionKladrId = regionKladrId;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }

    public static class Suggestions {
        private String value;

        @JsonAlias("unrestricted_value")
        private String unrestrictedValue;

        private Data data;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getUnrestrictedValue() {
            return unrestrictedValue;
        }

        public void setUnrestrictedValue(String unrestrictedValue) {
            this.unrestrictedValue = unrestrictedValue;
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }
    }

}