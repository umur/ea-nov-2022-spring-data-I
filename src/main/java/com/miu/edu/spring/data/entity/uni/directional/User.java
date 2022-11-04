package com.miu.edu.spring.data.entity.uni.directional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "user_uni_directional")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;

    private String password;

    private String firstName;

    private String lastname;

    @OneToOne
    private Address address;

    @OneToMany
    private List<Review> reviews;

}
