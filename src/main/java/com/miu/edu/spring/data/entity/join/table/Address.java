package com.miu.edu.spring.data.entity.join.table;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "address_join_table")
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String street;

    private String zip;

    private String city;

}
