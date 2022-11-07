package com.example.spring_data.dto;

import lombok.Data;

@Data
public class AddressDto {
    private Integer id;
    private String street;
    private String zip;
    private String city;

}