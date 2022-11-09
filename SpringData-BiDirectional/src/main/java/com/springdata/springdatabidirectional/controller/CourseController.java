package com.springdata.springdatabidirectional.controller;

import com.springdata.springdatabidirectional.entity.Course;
import com.springdata.springdatabidirectional.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("courses")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping("search/{fee}")
    public List<Course> findCoursesLessThanPrice(@PathVariable double fee) {
        return courseService.findByCoursesLessThan(fee);
    }
}
