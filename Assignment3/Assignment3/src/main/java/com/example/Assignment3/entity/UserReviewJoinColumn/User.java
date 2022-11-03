package com.example.Assignment3.entity.UserReviewJoinColumn;

import com.example.Assignment3.entity.unidirectional.Address;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "UserRJoinColumn")
@Data
public class User {
    @Id
    private int id;
    private String email, password, firstName, lastname;

    @OneToMany
    @JoinColumn(name = "id_user")
    private List<Review> reviews;

}
