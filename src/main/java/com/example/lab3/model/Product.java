package com.example.lab3.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private int rating;

    @ManyToOne
    @JoinColumn(name = "cat_id")
    @JsonManagedReference
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<Review> reviews;
}
