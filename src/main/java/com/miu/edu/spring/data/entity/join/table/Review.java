package com.miu.edu.spring.data.entity.join.table;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "review_join_table")
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String comment;

}
