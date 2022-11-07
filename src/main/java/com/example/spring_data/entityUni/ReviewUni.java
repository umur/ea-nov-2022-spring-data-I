package com.example.spring_data.entityUni;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "reviewUni")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reviewUni")
public class ReviewUni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;

    @ManyToOne()
    @JoinColumn(name="userUni_id")
    private UserUni user;

    @ManyToOne()
    @JoinColumn(name="productUni_id")
    private ProductUni product;




}
