package com.springdata.springdatabidirectional.service;

import com.springdata.springdatabidirectional.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> findByCoursesLessThan(double fee);
}
