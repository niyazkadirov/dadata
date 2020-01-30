package com.example.dadata.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.ZoneId;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Dadata {

    private String postalCode;
    private String country;
    @JsonAlias("country_iso_code")
    private String countryIsoCode;
    @JsonAlias("federal_district")
    private String federalDistrict;
    @JsonAlias("region_fias_id")
    private String regionFiasId;
    @JsonAlias("region_kladr_id")
    private String regionKladrId;
    @JsonAlias("region_iso_code")
    private String regionIsoCode;
    @JsonAlias("region_with_type")
    private String regionWithType;
    @JsonAlias("region_type")
    private String regionType;
    @JsonAlias("region_type_full")
    private String regionTypeFull;
    private String region;
    @JsonAlias("area_fias_id")
    private String areaFiasId;
    @JsonAlias("area_kladr_id")
    private String areaKladrId;
    @JsonAlias("area_with_type")
    private String areaWithType;
    @JsonAlias("area_type")
    private String areaType;
    @JsonAlias("area_type_full")
    private String areaTypeFull;
    private String area;
    @JsonAlias("city_fias_id")
    private String cityFiasId;
    @JsonAlias("city_kladr_id")
    private String cityKladrId;
    @JsonAlias("city_with_type")
    private String cityWithType;
    @JsonAlias("city_type")
    private String cityType;
    @JsonAlias("city_type_full")
    private String cityTypeFull;
    private String city;
    @JsonAlias("city_area")
    private String cityArea;
    @JsonAlias("city_district_fias_id")
    private String cityDistrictFiasId;
    @JsonAlias("city_district_kladr_id")
    private String cityDistrictKladrId;
    @JsonAlias("city_district_with_type")
    private String cityDistrictWithType;
    @JsonAlias("city_district_type")
    private String cityDistrictType;
    @JsonAlias("city_district_type_full")
    private String cityDistrictTypeFull;
    @JsonAlias("city_district")
    private String cityDistrict;
    @JsonAlias("settlement_fias_id")
    private String settlementFiasId;
    @JsonAlias("settlement_kladr_id")
    private String settlementKladrId;
    @JsonAlias("settlement_with_type")
    private String settlementWithType;
    @JsonAlias("settlement_type")
    private String settlementType;
    @JsonAlias("settlement_type_full")
    private String settlementTypeFull;
    private String settlement;
    @JsonAlias("street_fias_id")
    private String streetFiasId;
    @JsonAlias("street_kladr_id")
    private String streetKladrId;
    @JsonAlias("street_with_type")
    private String streetWithType;
    @JsonAlias("street_type")
    private String streetType;
    @JsonAlias("street_type_full")
    private String streetTypeFull;
    private String street;
    @JsonAlias("house_fias_id")
    private String houseFiasId;
    @JsonAlias("house_kladr_id")
    private String houseKladrId;
    @JsonAlias("house_type")
    private String houseType;
    @JsonAlias("house_type_full")
    private String houseTypeFull;
    private String house;
    @JsonAlias("block_type")
    private String blockType;
    @JsonAlias("block_type_full")
    private String blockTypeFull;
    private String block;
    @JsonAlias("flat_type")
    private String flatType;
    @JsonAlias("flat_type_full")
    private String flatTypeFull;
    private String flat;
    @JsonAlias("flat_area")
    private Double flatArea;
    @JsonAlias("square_meter_price")
    private Double squareMeterPrice;
    @JsonAlias("flat_price")
    private Double flatPrice;
    @JsonAlias("postal_box")
    private String postalBox;
    @JsonAlias("fias_id")
    private String fiasId;
    @JsonAlias("fias_code")
    private String fiasCode;
    @JsonAlias("fias_level")
    private String fiasLevel;
    @JsonAlias("fias_actuality_state")
    private String fiasActualityState;
    @JsonAlias("kladr_id")
    private String kladrId;
    @JsonAlias("geoname_id")
    private String geonameId;
    @JsonAlias("capital_marker")
    private String capitalMarker;
    private String okato;
    private String oktmo;
    @JsonAlias("tax_office")
    private String taxOffice;
    @JsonAlias("tax_office_legal")
    private String taxOfficeLegal;
    private ZoneId timezone;
    @JsonAlias("geo_lat")
    private Double geoLat;
    @JsonAlias("geo_lon")
    private Double geoLon;
    @JsonAlias("beltway_hit")
    private String beltwayHit;
    @JsonAlias("beltway_distance")
    private Double beltwayDistance;
    private List<Metro> metro;
    @JsonAlias("qc_geo")
    private String qcGeo;
    @JsonAlias("qc_complete")
    private String qcComplete;
    @JsonAlias("qc_house")
    private String qcHouse;
    @JsonAlias("history_values")
    private List<String> historyValues;
    @JsonAlias("unparsed_parts")
    private String unparsedParts;
    private String source;
    private String qc;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    public void setCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }

    public String getFederalDistrict() {
        return federalDistrict;
    }

    public void setFederalDistrict(String federalDistrict) {
        this.federalDistrict = federalDistrict;
    }

    public String getRegionFiasId() {
        return regionFiasId;
    }

    public void setRegionFiasId(String regionFiasId) {
        this.regionFiasId = regionFiasId;
    }

    public String getRegionKladrId() {
        return regionKladrId;
    }

    public void setRegionKladrId(String regionKladrId) {
        this.regionKladrId = regionKladrId;
    }

    public String getRegionIsoCode() {
        return regionIsoCode;
    }

    public void setRegionIsoCode(String regionIsoCode) {
        this.regionIsoCode = regionIsoCode;
    }

    public String getRegionWithType() {
        return regionWithType;
    }

    public void setRegionWithType(String regionWithType) {
        this.regionWithType = regionWithType;
    }

    public String getRegionType() {
        return regionType;
    }

    public void setRegionType(String regionType) {
        this.regionType = regionType;
    }

    public String getRegionTypeFull() {
        return regionTypeFull;
    }

    public void setRegionTypeFull(String regionTypeFull) {
        this.regionTypeFull = regionTypeFull;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAreaFiasId() {
        return areaFiasId;
    }

    public void setAreaFiasId(String areaFiasId) {
        this.areaFiasId = areaFiasId;
    }

    public String getAreaKladrId() {
        return areaKladrId;
    }

    public void setAreaKladrId(String areaKladrId) {
        this.areaKladrId = areaKladrId;
    }

    public String getAreaWithType() {
        return areaWithType;
    }

    public void setAreaWithType(String areaWithType) {
        this.areaWithType = areaWithType;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    public String getAreaTypeFull() {
        return areaTypeFull;
    }

    public void setAreaTypeFull(String areaTypeFull) {
        this.areaTypeFull = areaTypeFull;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCityFiasId() {
        return cityFiasId;
    }

    public void setCityFiasId(String cityFiasId) {
        this.cityFiasId = cityFiasId;
    }

    public String getCityKladrId() {
        return cityKladrId;
    }

    public void setCityKladrId(String cityKladrId) {
        this.cityKladrId = cityKladrId;
    }

    public String getCityWithType() {
        return cityWithType;
    }

    public void setCityWithType(String cityWithType) {
        this.cityWithType = cityWithType;
    }

    public String getCityType() {
        return cityType;
    }

    public void setCityType(String cityType) {
        this.cityType = cityType;
    }

    public String getCityTypeFull() {
        return cityTypeFull;
    }

    public void setCityTypeFull(String cityTypeFull) {
        this.cityTypeFull = cityTypeFull;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityArea() {
        return cityArea;
    }

    public void setCityArea(String cityArea) {
        this.cityArea = cityArea;
    }

    public String getCityDistrictFiasId() {
        return cityDistrictFiasId;
    }

    public void setCityDistrictFiasId(String cityDistrictFiasId) {
        this.cityDistrictFiasId = cityDistrictFiasId;
    }

    public String getCityDistrictKladrId() {
        return cityDistrictKladrId;
    }

    public void setCityDistrictKladrId(String cityDistrictKladrId) {
        this.cityDistrictKladrId = cityDistrictKladrId;
    }

    public String getCityDistrictWithType() {
        return cityDistrictWithType;
    }

    public void setCityDistrictWithType(String cityDistrictWithType) {
        this.cityDistrictWithType = cityDistrictWithType;
    }

    public String getCityDistrictType() {
        return cityDistrictType;
    }

    public void setCityDistrictType(String cityDistrictType) {
        this.cityDistrictType = cityDistrictType;
    }

    public String getCityDistrictTypeFull() {
        return cityDistrictTypeFull;
    }

    public void setCityDistrictTypeFull(String cityDistrictTypeFull) {
        this.cityDistrictTypeFull = cityDistrictTypeFull;
    }

    public String getCityDistrict() {
        return cityDistrict;
    }

    public void setCityDistrict(String cityDistrict) {
        this.cityDistrict = cityDistrict;
    }

    public String getSettlementFiasId() {
        return settlementFiasId;
    }

    public void setSettlementFiasId(String settlementFiasId) {
        this.settlementFiasId = settlementFiasId;
    }

    public String getSettlementKladrId() {
        return settlementKladrId;
    }

    public void setSettlementKladrId(String settlementKladrId) {
        this.settlementKladrId = settlementKladrId;
    }

    public String getSettlementWithType() {
        return settlementWithType;
    }

    public void setSettlementWithType(String settlementWithType) {
        this.settlementWithType = settlementWithType;
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }

    public String getSettlementTypeFull() {
        return settlementTypeFull;
    }

    public void setSettlementTypeFull(String settlementTypeFull) {
        this.settlementTypeFull = settlementTypeFull;
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    public String getStreetFiasId() {
        return streetFiasId;
    }

    public void setStreetFiasId(String streetFiasId) {
        this.streetFiasId = streetFiasId;
    }

    public String getStreetKladrId() {
        return streetKladrId;
    }

    public void setStreetKladrId(String streetKladrId) {
        this.streetKladrId = streetKladrId;
    }

    public String getStreetWithType() {
        return streetWithType;
    }

    public void setStreetWithType(String streetWithType) {
        this.streetWithType = streetWithType;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getStreetTypeFull() {
        return streetTypeFull;
    }

    public void setStreetTypeFull(String streetTypeFull) {
        this.streetTypeFull = streetTypeFull;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseFiasId() {
        return houseFiasId;
    }

    public void setHouseFiasId(String houseFiasId) {
        this.houseFiasId = houseFiasId;
    }

    public String getHouseKladrId() {
        return houseKladrId;
    }

    public void setHouseKladrId(String houseKladrId) {
        this.houseKladrId = houseKladrId;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getHouseTypeFull() {
        return houseTypeFull;
    }

    public void setHouseTypeFull(String houseTypeFull) {
        this.houseTypeFull = houseTypeFull;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getBlockType() {
        return blockType;
    }

    public void setBlockType(String blockType) {
        this.blockType = blockType;
    }

    public String getBlockTypeFull() {
        return blockTypeFull;
    }

    public void setBlockTypeFull(String blockTypeFull) {
        this.blockTypeFull = blockTypeFull;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getFlatType() {
        return flatType;
    }

    public void setFlatType(String flatType) {
        this.flatType = flatType;
    }

    public String getFlatTypeFull() {
        return flatTypeFull;
    }

    public void setFlatTypeFull(String flatTypeFull) {
        this.flatTypeFull = flatTypeFull;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public Double getFlatArea() {
        return flatArea;
    }

    public void setFlatArea(Double flatArea) {
        this.flatArea = flatArea;
    }

    public Double getSquareMeterPrice() {
        return squareMeterPrice;
    }

    public void setSquareMeterPrice(Double squareMeterPrice) {
        this.squareMeterPrice = squareMeterPrice;
    }

    public Double getFlatPrice() {
        return flatPrice;
    }

    public void setFlatPrice(Double flatPrice) {
        this.flatPrice = flatPrice;
    }

    public String getPostalBox() {
        return postalBox;
    }

    public void setPostalBox(String postalBox) {
        this.postalBox = postalBox;
    }

    public String getFiasId() {
        return fiasId;
    }

    public void setFiasId(String fiasId) {
        this.fiasId = fiasId;
    }

    public String getFiasCode() {
        return fiasCode;
    }

    public void setFiasCode(String fiasCode) {
        this.fiasCode = fiasCode;
    }

    public String getFiasLevel() {
        return fiasLevel;
    }

    public void setFiasLevel(String fiasLevel) {
        this.fiasLevel = fiasLevel;
    }

    public String getFiasActualityState() {
        return fiasActualityState;
    }

    public void setFiasActualityState(String fiasActualityState) {
        this.fiasActualityState = fiasActualityState;
    }

    public String getKladrId() {
        return kladrId;
    }

    public void setKladrId(String kladrId) {
        this.kladrId = kladrId;
    }

    public String getGeonameId() {
        return geonameId;
    }

    public void setGeonameId(String geonameId) {
        this.geonameId = geonameId;
    }

    public String getCapitalMarker() {
        return capitalMarker;
    }

    public void setCapitalMarker(String capitalMarker) {
        this.capitalMarker = capitalMarker;
    }

    public String getOkato() {
        return okato;
    }

    public void setOkato(String okato) {
        this.okato = okato;
    }

    public String getOktmo() {
        return oktmo;
    }

    public void setOktmo(String oktmo) {
        this.oktmo = oktmo;
    }

    public String getTaxOffice() {
        return taxOffice;
    }

    public void setTaxOffice(String taxOffice) {
        this.taxOffice = taxOffice;
    }

    public String getTaxOfficeLegal() {
        return taxOfficeLegal;
    }

    public void setTaxOfficeLegal(String taxOfficeLegal) {
        this.taxOfficeLegal = taxOfficeLegal;
    }

    public ZoneId getTimezone() {
        return timezone;
    }

    public void setTimezone(ZoneId timezone) {
        this.timezone = timezone;
    }

    public Double getGeoLat() {
        return geoLat;
    }

    public void setGeoLat(Double geoLat) {
        this.geoLat = geoLat;
    }

    public Double getGeoLon() {
        return geoLon;
    }

    public void setGeoLon(Double geoLon) {
        this.geoLon = geoLon;
    }

    public String getBeltwayHit() {
        return beltwayHit;
    }

    public void setBeltwayHit(String beltwayHit) {
        this.beltwayHit = beltwayHit;
    }

    public Double getBeltwayDistance() {
        return beltwayDistance;
    }

    public void setBeltwayDistance(Double beltwayDistance) {
        this.beltwayDistance = beltwayDistance;
    }

    public List<Metro> getMetro() {
        return metro;
    }

    public void setMetro(List<Metro> metro) {
        this.metro = metro;
    }

    public String getQcGeo() {
        return qcGeo;
    }

    public void setQcGeo(String qcGeo) {
        this.qcGeo = qcGeo;
    }

    public String getQcComplete() {
        return qcComplete;
    }

    public void setQcComplete(String qcComplete) {
        this.qcComplete = qcComplete;
    }

    public String getQcHouse() {
        return qcHouse;
    }

    public void setQcHouse(String qcHouse) {
        this.qcHouse = qcHouse;
    }

    public List<String> getHistoryValues() {
        return historyValues;
    }

    public void setHistoryValues(List<String> historyValues) {
        this.historyValues = historyValues;
    }

    public String getUnparsedParts() {
        return unparsedParts;
    }

    public void setUnparsedParts(String unparsedParts) {
        this.unparsedParts = unparsedParts;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getQc() {
        return qc;
    }

    public void setQc(String qc) {
        this.qc = qc;
    }

    public static class Metro {

        private String name;
        private String line;
        private Double distance;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLine() {
            return line;
        }

        public void setLine(String line) {
            this.line = line;
        }

        public Double getDistance() {
            return distance;
        }

        public void setDistance(Double distance) {
            this.distance = distance;
        }
    }
}