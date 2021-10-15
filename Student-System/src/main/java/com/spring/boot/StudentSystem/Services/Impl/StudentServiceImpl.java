package com.spring.boot.StudentSystem.Services.Impl;

import com.spring.boot.StudentSystem.Entity.Student;
import com.spring.boot.StudentSystem.Repository.StudentRepository;
import com.spring.boot.StudentSystem.Services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    // inject the dependancies
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll(); // returns a list of students
    }
}
