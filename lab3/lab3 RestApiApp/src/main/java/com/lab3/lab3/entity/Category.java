package com.lab3.lab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCategory")
    private List<Product> products;

    public void addProduct(Product product){
        products.add(product);
    }
}
