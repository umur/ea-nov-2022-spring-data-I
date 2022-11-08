package com.example.springdataI.dto;

import com.example.springdataI.entity.Address;
import com.example.springdataI.entity.Review;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import java.util.List;

@Data
public class UsersDto {
    private Integer id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;


    private List <ReviewDto> reviews;

    private AddressDto address;
}
