package com.miu.edu.spring.data.entity.join.table;

import com.miu.edu.spring.data.entity.Address;
import com.miu.edu.spring.data.entity.Review;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "user_join_table")
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
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany
    private List<Review> reviews;

}
