package com.example.Assignment3.entity.unidirectional;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    private int id;
    private String email, password, firstName, lastname;

    @OneToMany
    @JoinColumn(name = "id_user")
    private List<Review> reviews;

    @OneToOne
    private Address address;
}
