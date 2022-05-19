package com.example.secondclassed.Student;

import java.time.LocalDate;

public class student {       //modal class
    private Long id;
    private String name;
    private LocalDate dob;
    private Integer age;
    private String semester;
    private String Department;



    public student(Long id, String name, LocalDate dob, Integer age, String semester, String department) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.semester = semester;
        Department = department;
    }

    public Long getId() {return id;}

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Integer getAge() {
        return age;
    }

    public String getSemester() {
        return semester;
    }

    public String getDepartment() {
        return Department;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setDepartment(String department) {
        Department = department;
    }

}
