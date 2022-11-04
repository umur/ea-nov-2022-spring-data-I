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
@Entity(name = "uni_review")
public class UniReview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String comment;

    @ManyToOne
    private UniProduct product;

    @ManyToOne
    private UniUser user;
}
