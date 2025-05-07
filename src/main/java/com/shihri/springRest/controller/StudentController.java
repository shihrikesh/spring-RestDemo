package com.shihri.springRest.controller;

import com.shihri.springRest.business.StudentService;
import com.shihri.springRest.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student-management")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/student", produces = "Application/json")
    public ResponseEntity<List<Student>> getAllStudent(){

        return new ResponseEntity<>(studentService.getStudentList(), HttpStatus.OK);

    }

    @PostMapping(value = "/student", produces = "Application/json")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){

        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.OK);

    }
}
