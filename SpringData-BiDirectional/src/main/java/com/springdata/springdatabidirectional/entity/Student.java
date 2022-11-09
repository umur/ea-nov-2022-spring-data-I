package com.springdata.springdatabidirectional.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String dept;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "student_course",
            joinColumns = {
                    @JoinColumn(name = "student_id", referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "course_id", referencedColumnName = "id")
            })
    @JsonManagedReference
//    @JsonIgnore
//    @JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
    private Set<Course> courses;
}
