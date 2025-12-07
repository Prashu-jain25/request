package com.practice.learningapi.controller;

import com.practice.learningapi.entity.Student;
import com.practice.learningapi.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    // INSERT STUDENT
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        System.out.println("hello world!");
        return studentService.saveStudent(student);
    }

    //  GET STUDENT BY ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
}
