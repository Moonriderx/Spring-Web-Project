package com.spring.boot.StudentSystem.Controllers;

import com.spring.boot.StudentSystem.Services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // handler method which handles list students and return model and view

    @GetMapping("/students")
    public String listStudent(Model model) {
     model.addAttribute("students", studentService.getAllStudents());
     return "students";
    }
}
