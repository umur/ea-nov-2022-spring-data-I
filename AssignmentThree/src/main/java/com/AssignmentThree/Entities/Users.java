package com.AssignmentThree.Entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Users {

    @Id
    int id;
    String email;
    String password;
    String firstName;
    String lastName;
    @OneToMany
    List<Reviews> reviews;
    @ManyToOne
    Addresses addresses;

}
