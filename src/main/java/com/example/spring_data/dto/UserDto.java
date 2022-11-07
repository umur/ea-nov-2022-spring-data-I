package com.example.spring_data.dto;

import java.util.List;

public class UserDto {
    private Integer id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;


    private List<ReviewDto> reviews;

    private AddressDto address;
}
