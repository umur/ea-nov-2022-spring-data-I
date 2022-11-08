package com.example.springdataI;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EaNov2022SpringDataIApplication {

    public static void main (String[] args) {
        SpringApplication.run (EaNov2022SpringDataIApplication.class,args);
    }
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
