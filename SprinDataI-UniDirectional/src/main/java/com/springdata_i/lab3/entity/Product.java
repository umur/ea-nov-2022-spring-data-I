package com.springdata_i.lab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private String rating;
    @OneToMany
    @JoinColumn(name = "review_id")
    private List<Review> reviews;
    }
