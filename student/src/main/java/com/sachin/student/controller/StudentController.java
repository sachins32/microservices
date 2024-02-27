package com.sachin.student.controller;

import com.sachin.student.model.Student;
import com.sachin.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getStudent(@PathVariable int id) {
        return studentService.getStudent(id);
    }
}
