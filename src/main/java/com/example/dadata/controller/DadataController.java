package com.example.dadata.controller;

import com.example.dadata.service.DadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DadataController {

    @Autowired
    DadataService dadataService;

    @GetMapping("/{location}/{param}")
    public <T> T getLocation(@PathVariable("location") String location,
                             @PathVariable("param") String param) {

        return dadataService.getInfoByLocation(location, param);
    }
}