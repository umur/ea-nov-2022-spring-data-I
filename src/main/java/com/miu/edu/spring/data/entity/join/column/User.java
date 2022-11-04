package com.miu.edu.spring.data.entity.join.column;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "user_join_column")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;

    private String password;

    private String firstName;

    private String lastname;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Address address;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Review> reviews;

}
