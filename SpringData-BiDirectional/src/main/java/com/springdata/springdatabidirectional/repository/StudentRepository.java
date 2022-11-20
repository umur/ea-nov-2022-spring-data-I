package com.springdata.springdatabidirectional.repository;

import com.springdata.springdatabidirectional.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
    List<Student> findByNameContains(String name);
    List<Student> findAll();
    Student findStudentById(Long id);
}
