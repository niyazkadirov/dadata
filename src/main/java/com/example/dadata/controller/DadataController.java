package com.example.dadata.controller;

import com.example.dadata.service.DadataService;
import com.example.dadata.service.DadataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DadataController {

    @Autowired
    DadataServiceImpl dadataService;

    @GetMapping("/{location}")
    public <T> T getAllParamForLocation(@PathVariable("location") String location) {
        return dadataService.getAllParam(location);
    }

    @GetMapping("/{location}/{param}")
    public <T> T getParamForLocation(@PathVariable("location") String location,
                                     @PathVariable("param") String param) {
        return dadataService.getInfoByParam(location, param);
    }


}