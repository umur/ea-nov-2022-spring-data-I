package com.example.Assignment3.entity.unidirectional;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {
    @Id
    private int id;
    private String name;
    private double price;
    private int rating;

    @OneToMany
    @JoinColumn(name = "id_product")
    private List<Review> reviews;
}
