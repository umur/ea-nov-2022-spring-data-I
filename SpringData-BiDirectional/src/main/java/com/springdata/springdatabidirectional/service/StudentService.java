package com.springdata.springdatabidirectional.service;

import com.springdata.springdatabidirectional.entity.Student;

import java.util.List;
public interface StudentService {
    List<Student> findByNameContains(String name);
    Student save(Student student);
    List<Student> findAll();
    Student findStudentById(Long id);
}
