package com.example.lab3.model;

import javax.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;

    @ManyToOne
    private Product product;

//    @ManyToOne
//    @JoinColumn(name = "user1_id")
//    private User1 user;
}
