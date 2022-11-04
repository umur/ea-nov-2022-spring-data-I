package com.springdata_i.lab3.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private int zip;
    private String city;
    @OneToOne
    @JoinColumn(name = "address_id")
    private User user;

}
