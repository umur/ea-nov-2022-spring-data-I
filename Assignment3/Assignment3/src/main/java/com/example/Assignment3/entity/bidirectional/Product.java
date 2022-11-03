package com.example.Assignment3.entity.bidirectional;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "ProductBi")
@Data
public class Product {
    @Id
    private int id;
    private String name;
    private int price;
    private double rating;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "productReview")
    private List<Review> reviews;
}
