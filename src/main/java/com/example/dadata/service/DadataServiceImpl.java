package com.example.dadata.service;

public interface DadataServiceImpl{

    public <T> T getInfoByParam(String location, String param);

    public <T> T getAllParam(String location);
}
