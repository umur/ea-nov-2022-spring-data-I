package com.example.spring_data.entityUni;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "userUni")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usersUni")
public class UserUni {

    @Id
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToOne
    @JoinColumn(name = "addressUni_id")
    private AddressUni address;

//    @OneToMany()
//    @JoinTable(name = "users_tasks_uni",joinColumns =
//    @JoinColumn(name = "user_id",referencedColumnName = "id"),
//            inverseJoinColumns= @JoinColumn(name = "review_id",referencedColumnName = "id"))
//    List<ReviewUni> reviews;

}
