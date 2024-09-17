package com.example.springstudents.controller;


import com.example.springstudents.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> findAllStudent() {
        return List.of(
                Student.builder().firstName("Maks").email("maks1@gmail.com").age(20).build(),
                Student.builder().firstName("Arman").email("arman2@gmail.com").age(21).build(),
                Student.builder().firstName("Erke").email("erke3@gmail.com").age(18).build()
        );
    }
}
