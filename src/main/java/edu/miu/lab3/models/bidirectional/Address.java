package edu.miu.lab3.models.bidirectional;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Getter
public class Address {
    @Id
    private String id;
    private String street;
    private String zip;
    private String city;

    @OneToOne
    Users user;


}
