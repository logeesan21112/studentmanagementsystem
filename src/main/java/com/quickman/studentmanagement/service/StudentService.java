package com.quickman.studentmanagement.service;

import java.util.List;

import com.quickman.studentmanagement.model.Student;

public interface StudentService {
	
	public String createStudent(Student student);
	public String updateStudent(Student student);
	public String deleteStudent(String studentId);
	public Student getStudent(String studentId);
	public List<Student> getAllStudent();
}
