package com.quickman.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickman.studentmanagement.model.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

}
