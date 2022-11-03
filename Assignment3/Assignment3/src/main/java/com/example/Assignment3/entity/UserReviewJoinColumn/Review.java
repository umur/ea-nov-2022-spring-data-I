package com.example.Assignment3.entity.UserReviewJoinColumn;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ReviewJoinColumn")
@Data
public class Review {
    @Id
    private int id;
    private String comment;
}
