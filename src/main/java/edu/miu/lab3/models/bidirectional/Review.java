package edu.miu.lab3.models.bidirectional;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
public class Review {
    @Id
    private String id;
    private String comment;

    @ManyToOne
    Product product;

    @ManyToOne
    Users user;
}
