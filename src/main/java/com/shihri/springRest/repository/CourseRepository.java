package com.shihri.springRest.repository;

import com.shihri.springRest.entity.Course;
import com.shihri.springRest.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
