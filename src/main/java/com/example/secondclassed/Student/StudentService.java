package com.example.secondclassed.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<student> getStudent(){
     return List.of(new student(
             1L,
             "Harran",
             LocalDate.of(2000, Month.APRIL,7),
             22,
             "7th",
             "Computer Science"
     ));

    }


}
