package com.shihri.springRest.business.impl;

import com.shihri.springRest.business.StudentService;
import com.shihri.springRest.entity.Student;
import com.shihri.springRest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        System.out.println(student);
        return studentRepository.save(student);
    }
}
