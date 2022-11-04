package com.directional.SpringDataAssignment.SpringDataAssignment.Entity.BiDirectional;

import lombok.Data;

import javax.persistence.*;

@Data

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String zip;
    private String city;

    @OneToOne
    public User user;
}
