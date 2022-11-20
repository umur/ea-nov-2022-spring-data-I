package com.springdata.springdatabidirectional.repository;

import com.springdata.springdatabidirectional.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course,Long> {
    List<Course> findByFeeLessThan(double fee);
}
