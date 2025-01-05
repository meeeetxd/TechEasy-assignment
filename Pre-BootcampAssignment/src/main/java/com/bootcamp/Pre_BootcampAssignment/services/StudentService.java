package com.bootcamp.Pre_BootcampAssignment.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.Pre_BootcampAssignment.entity.Student;
import com.bootcamp.Pre_BootcampAssignment.repository.StudentRepository;

@Service
public class StudentService {
	private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
