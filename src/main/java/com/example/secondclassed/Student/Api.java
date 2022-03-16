package com.example.secondclassed.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController


@RequestMapping(path="api/v1/student")
public class Api {
//instantiate in java
//reference
    private final StudentService studentservice;

             //dependency Injection
@GetMapping
public List<student> getStudent(){
    return studentservice.getStudent();
}
    @Autowired
    public Api(StudentService studentservice) {              //constructor
       this.studentservice = studentservice;
    }
}
