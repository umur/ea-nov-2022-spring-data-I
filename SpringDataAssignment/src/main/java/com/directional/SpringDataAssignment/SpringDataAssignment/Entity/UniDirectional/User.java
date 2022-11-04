package com.directional.SpringDataAssignment.SpringDataAssignment.Entity.UniDirectional;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;



    @JoinColumn(name="user_id")
    @OneToMany
    private List<Review> review;

}
