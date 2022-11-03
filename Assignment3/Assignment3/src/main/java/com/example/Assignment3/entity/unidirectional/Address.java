package com.example.Assignment3.entity.unidirectional;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Data
public class Address {
    @Id
    private int id;
    private String street, zip, city;

    @OneToOne
    private User user;
}
