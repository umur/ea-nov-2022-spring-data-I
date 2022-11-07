package com.example.spring_data.entityUni;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "categoryUni")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categoryUni")
public class CategoryUni {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "category")
    List<ProductUni> products;
}
