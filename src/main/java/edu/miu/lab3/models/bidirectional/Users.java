package edu.miu.lab3.models.bidirectional;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Getter
public class Users {
    @Id
    private String id;
    private String name;
    private String rating;
    private double price;

    @OneToMany(mappedBy = "user")
    List<Review> reviews;

    @OneToOne
    Address address;
}
