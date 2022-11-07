package com.example.spring_data.entityUni;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "productUni")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "productUni")
public class ProductUni {
    @Id
    private int id;

    private String name;
    private double price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "catgoryUni_id")
    CategoryUni category;

//    @OneToMany(mappedBy = "product")
//    private List<Review> reviews;

}
