package com.shihri.springRest.business;

import com.shihri.springRest.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudentList();

    Student saveStudent(Student student);

}
