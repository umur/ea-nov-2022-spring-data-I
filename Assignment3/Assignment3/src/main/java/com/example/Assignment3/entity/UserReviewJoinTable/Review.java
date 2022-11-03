package com.example.Assignment3.entity.UserReviewJoinTable;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ReviewJoinTable")
@Data
public class Review {
    @Id
    private int id;
    private String comment;
}
