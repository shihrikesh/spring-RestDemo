package com.shihri.springRest.repository;

import com.shihri.springRest.entity.Staff;
import com.shihri.springRest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
