package com.bootcamp.Pre_BootcampAssignment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.bootcamp.Pre_BootcampAssignment.entity.Subject;
import com.bootcamp.Pre_BootcampAssignment.services.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

	private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectService.saveSubject(subject);
    }

    @GetMapping
    public List<Subject> listAllSubjects() {
        return subjectService.getAllSubjects();
    }
}
