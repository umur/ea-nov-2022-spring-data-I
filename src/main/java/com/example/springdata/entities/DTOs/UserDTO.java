package com.example.springdata.entities.DTOs;

import com.example.springdata.entities.Address;
import com.example.springdata.entities.Review;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
public class UserDTO {
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Address address;
}
