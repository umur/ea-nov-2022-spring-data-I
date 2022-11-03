package com.example.Assignment3.entity.unidirectional;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Category {
    @Id
    private int id;

    private String name;

    @OneToMany
    @JoinColumn(name = "id_category")
    private List<Product> products;
}
