package com.bootcamp.Pre_BootcampAssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.Pre_BootcampAssignment.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
