package com.springdata.springdatabidirectional.service.Impl;

import com.springdata.springdatabidirectional.entity.Course;
import com.springdata.springdatabidirectional.repository.CourseRepository;
import com.springdata.springdatabidirectional.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public List<Course> findByCoursesLessThan(double fee) {
        return courseRepository.findByFeeLessThan(fee);
    }
}
