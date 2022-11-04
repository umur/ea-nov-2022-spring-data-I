package edu.miu.lab3.springdatai.entity.uni;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
@Setter
@Getter
@Entity(name = "uni_product")
public class UniProduct {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    private Double price;
    private Integer rating;

    @ManyToOne
    private UniCategory category;
}
