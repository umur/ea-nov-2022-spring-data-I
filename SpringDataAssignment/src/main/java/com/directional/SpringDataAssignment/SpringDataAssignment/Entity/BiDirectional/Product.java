package com.directional.SpringDataAssignment.SpringDataAssignment.Entity.BiDirectional;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private double rating;


    @OneToMany(mappedBy = "product")
    List<Review> review;

    @ManyToOne
    public Category category;

}
