package com.directional.SpringDataAssignment.SpringDataAssignment.Entity.BiDirectional;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data

@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;

    @OneToOne(mappedBy = "user")
    private Address address;


    @OneToMany(mappedBy = "user")
    private List<Review> review;

}
