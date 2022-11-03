package com.example.Assignment3.entity.bidirectional;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity(name = "UserBi")
@Data
public class User {
    @Id
    private int id;
    private String email, password, firstName, lastname;

    @OneToMany(mappedBy = "userReview")
    private List<Review> reviews;

    @OneToOne
    private Address address;
}
