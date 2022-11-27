package com.lab3.lab3.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Review {
    @Id

    private long id;
    private String comment;
}
