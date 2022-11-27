package com.lab3.lab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "userTable")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idUser")
    private List<Review> reviews;

 public void addReview(Review review){
     reviews.add(review);
 }

}
