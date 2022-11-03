package com.example.Assignment3.entity.UserAddressJoinTable;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "AddressJoinTable")
@Data
public class Address {
    @Id
    private int id;
    private String street, zip, city;

    @OneToOne
    private User user;
}
