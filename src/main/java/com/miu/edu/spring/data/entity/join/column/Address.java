package com.miu.edu.spring.data.entity.join.column;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "address_join_column")
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String street;

    private String zip;

    private String city;

}
