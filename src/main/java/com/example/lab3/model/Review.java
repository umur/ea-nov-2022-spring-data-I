package com.example.lab3.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "product_id")
//    @JsonManagedReference
    private Product product;

//    @ManyToOne
//    @JoinColumn(name = "user1_id")
//    private User1 user;
}
