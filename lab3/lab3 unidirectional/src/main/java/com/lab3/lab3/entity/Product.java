package com.lab3.lab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Product {
    @Id

    private long id;
    private String name;
    private double price;
    private String rating ;

    @OneToMany
    @JoinColumn(name = "idProduct")
    private List<Review> reviews;
}
