package com.example.springdata.entities.DTOs;

import com.example.springdata.entities.User;
import lombok.Data;


@Data
public class AddressDTO {
    private Long id;
    private String street;
    private String zip;
    private String city;
}
