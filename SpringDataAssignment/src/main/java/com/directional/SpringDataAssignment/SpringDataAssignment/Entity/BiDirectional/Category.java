package com.directional.SpringDataAssignment.SpringDataAssignment.Entity.BiDirectional;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    @OneToMany(mappedBy = "category")
    private List<Product> product;
}
