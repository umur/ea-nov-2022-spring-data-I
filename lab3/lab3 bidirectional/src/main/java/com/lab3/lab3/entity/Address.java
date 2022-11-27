package com.lab3.lab3.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {
    @Id

    private long id;
    private String street;
    private String city;
    private String zip;

    @OneToOne(mappedBy = "address")
    private Users user;
}
