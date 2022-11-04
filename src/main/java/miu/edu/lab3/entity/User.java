package miu.edu.lab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "user1")
public class User {
    @Id
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;

    /*@OneToMany
    @JoinColumn(name = "user_id")
    private List<Review> reviews;

     */

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
