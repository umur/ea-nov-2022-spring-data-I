package com.example.Assignment3.entity.UserAddressJoinColumn;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "AddressJoinColumn")
@Data
public class Address {
    @Id
    private int id;
    private String street, zip, city;

}
