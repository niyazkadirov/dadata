package com.example.dadata.controller;

import com.example.dadata.service.DadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class DadataController {

    @Autowired
    DadataService dadataService;

    @GetMapping("/{location}")
    public Map<String, String> getLocation(@PathVariable("location") String location) {
        return dadataService.getInfoByLocation(location);
    }
}