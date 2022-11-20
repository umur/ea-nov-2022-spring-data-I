package com.springdata.springdatabidirectional.controller;


import com.springdata.springdatabidirectional.entity.Student;
import com.springdata.springdatabidirectional.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public Student saveStudentWithCourse(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping()
    public List<Student> findAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("find/{id}")
    public Student findStudentById(@PathVariable Long id) {
        return studentService.findStudentById(id);
    }

    @GetMapping("search/{name}")
    public List<Student> searchStudentsByName(@PathVariable String name) {
        return studentService.findByNameContains(name);
    }
}
