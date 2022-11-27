package com.lab3.lab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity

public class Category {
    @Id

    private long id;
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
