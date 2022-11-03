package com.example.Assignment3.entity.UserAddressJoinColumn;

import com.example.Assignment3.entity.unidirectional.Review;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "UserAJoinColumn")
@Data
public class User {
    @Id
    private int id;
    private String email, password, firstName, lastname;

    @OneToOne
    private Address address;
}
