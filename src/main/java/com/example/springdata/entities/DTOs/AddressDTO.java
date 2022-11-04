package com.example.springdata.entities.DTOs;

import lombok.Data;


@Data
public class AddressDTO {
    private Long id;
    private String street;
    private String zip;
    private String city;
}
