package com.example.studentapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class StudentController {

    List<Student> students = new ArrayList<>();

    @PostMapping("/students")
    public String addStudent(@RequestBody Student s) {
        students.add(s);
        return "Student added successfully!";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }
}