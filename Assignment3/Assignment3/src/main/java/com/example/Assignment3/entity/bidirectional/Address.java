package com.example.Assignment3.entity.bidirectional;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "AddressBi")
@Data
public class Address {
    @Id
    private int id;
    private String street, zip, city;

    @OneToOne(mappedBy = "address")
    private User user;
}
