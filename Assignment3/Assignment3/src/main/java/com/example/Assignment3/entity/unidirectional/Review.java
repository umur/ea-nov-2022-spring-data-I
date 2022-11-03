package com.example.Assignment3.entity.unidirectional;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Review {
    @Id
    private int id;
    private String comment;
}
