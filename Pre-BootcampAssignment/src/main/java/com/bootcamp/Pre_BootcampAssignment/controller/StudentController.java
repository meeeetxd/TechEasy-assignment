package com.bootcamp.Pre_BootcampAssignment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.bootcamp.Pre_BootcampAssignment.entity.Student;
import com.bootcamp.Pre_BootcampAssignment.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> listAllStudents() {
        return studentService.getAllStudents();
    }
}
