package com.practice.learningapi.service;

import com.practice.learningapi.entity.Student;

public interface StudentService {

    Student saveStudent(Student student);

    Student getStudentById(Long id);
}
