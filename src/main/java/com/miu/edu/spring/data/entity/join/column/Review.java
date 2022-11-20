package com.miu.edu.spring.data.entity.join.column;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "review_join_column")
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String comment;

}
