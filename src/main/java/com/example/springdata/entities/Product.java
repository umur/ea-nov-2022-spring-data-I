package com.example.springdata.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private double rating;

    @ManyToOne
    @JoinColumn(name = "id_category") // optional
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<Review> reviews;
}
