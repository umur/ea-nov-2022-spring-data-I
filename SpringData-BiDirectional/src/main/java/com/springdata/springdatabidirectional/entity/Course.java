package com.springdata.springdatabidirectional.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String abbreviation;
    private int modules;
    private double fee;
    @ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
    @JsonBackReference
//    @JsonIgnore
//    @JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
    private Set<Student> students;
    }