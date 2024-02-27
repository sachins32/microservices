package com.sachin.student.service;

import com.sachin.student.model.Student;
import com.sachin.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> getStudent(int id) {
        Optional<Student> student = studentRepository.findById(id);
        return student;
    }
}
