package com.example.Product.Review.entities.bi_directional;

import com.example.Product.Review.entities.Address;
import com.example.Product.Review.entities.Review;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class BiUser {

    @Id
    private long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews;

    @OneToOne(mappedBy = "user")
    private Address address;
}
