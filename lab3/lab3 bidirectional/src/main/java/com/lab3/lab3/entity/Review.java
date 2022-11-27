package com.lab3.lab3.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Review {
    @Id

    private long id;
    private String comment;


    @ManyToOne
    private Product product;

    @ManyToOne
    private Users user;
}
