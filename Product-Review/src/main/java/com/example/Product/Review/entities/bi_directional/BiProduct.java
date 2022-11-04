package com.example.Product.Review.entities.bi_directional;

import com.example.Product.Review.entities.Category;
import com.example.Product.Review.entities.Review;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class BiProduct {

    @Id
    private long id;
    private String name;
    private double price;
    private short rating;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<Review> reviews;
}
