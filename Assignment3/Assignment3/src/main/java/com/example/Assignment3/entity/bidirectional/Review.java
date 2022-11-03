package com.example.Assignment3.entity.bidirectional;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "ReviewBi")
@Data
public class Review {
    @Id
    private int id;
    private String comment;

    @ManyToOne
    private User userReview;

    @ManyToOne
    private Product productReview;
}
