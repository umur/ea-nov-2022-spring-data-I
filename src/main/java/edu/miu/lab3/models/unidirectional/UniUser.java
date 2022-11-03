package edu.miu.lab3.models.unidirectional;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
public class UniUser {
    @Id
    private String id;
    private String name;
    private String rating;
    private double price;

    @OneToMany
    @JoinColumn
    List<UniReview> reviews;

    @OneToOne
    UniAddress address;
}
