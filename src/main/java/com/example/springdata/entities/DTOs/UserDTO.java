package com.example.springdata.entities.DTOs;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private AddressDTO address;
    private List<ReviewDTO> reviews;
}
