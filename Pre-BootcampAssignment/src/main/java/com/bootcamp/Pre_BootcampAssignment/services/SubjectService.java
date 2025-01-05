package com.bootcamp.Pre_BootcampAssignment.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.Pre_BootcampAssignment.entity.Subject;
import com.bootcamp.Pre_BootcampAssignment.repository.SubjectRepository;

@Service
public class SubjectService {
	private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
}
