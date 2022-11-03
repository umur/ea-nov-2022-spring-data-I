package edu.miu.lab3.models.bidirectional;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
public class Product {
    @Id
    private String id;
    private String name;
    private String rating;
    private double price;

    @ManyToOne
    Category category;
    @OneToMany(mappedBy = "product")
    List<Review> reviews;
}
