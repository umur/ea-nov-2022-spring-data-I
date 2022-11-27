package com.lab3.lab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "userTable")
public class Users {
    @Id

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @OneToOne
    private Address address;


    @OneToMany
    @JoinColumn(name = "idUser")
    private List<Review> reviews;


}
