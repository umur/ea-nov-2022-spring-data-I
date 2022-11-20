package com.springdata.springdatabidirectional.service.Impl;

import com.springdata.springdatabidirectional.entity.Student;
import com.springdata.springdatabidirectional.repository.StudentRepository;
import com.springdata.springdatabidirectional.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> findByNameContains(String name) {
        return studentRepository.findByNameContains(name);
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

     @Override
    public Student findStudentById(Long id) {
        return studentRepository.findStudentById(id);
    }
}
