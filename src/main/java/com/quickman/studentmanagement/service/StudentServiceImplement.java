package com.quickman.studentmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quickman.studentmanagement.exception.StudentNotFoundException;
import com.quickman.studentmanagement.model.Student;
import com.quickman.studentmanagement.repository.StudentRepository;

@Service
public class StudentServiceImplement implements StudentService {
	
	StudentRepository studentRepository;
	
	public StudentServiceImplement(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public String createStudent(Student student) {
		studentRepository.save(student);
		return "Student was created successfully.";
	}

	@Override
	public String updateStudent(Student student) {
		studentRepository.save(student);
		return "Student was updated successfully.";
	}

	@Override
	public String deleteStudent(String studentId) {
		studentRepository.deleteById(studentId);
		return "Student was deleted successfully.";
	}

	@Override
	public Student getStudent(String studentId) {
		if(studentRepository.findById(studentId).isEmpty())
            throw new StudentNotFoundException("Student not found with the given ID.");
		return studentRepository.findById(studentId).get();
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

}
