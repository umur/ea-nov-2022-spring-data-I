package com.example.Assignment3.entity.UserReviewJoinTable;

import com.example.Assignment3.entity.unidirectional.Address;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "UserRJoinTable")
@Data
public class User {
    @Id
    private int id;
    private String email, password, firstName, lastname;

    @OneToMany
    private List<Review> reviews;

}
