package com.example.dadata;

import com.example.dadata.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class DadataApplication {

    public static void main(String[] args) {
        SpringApplication.run(DadataApplication.class, args);
    }

}
