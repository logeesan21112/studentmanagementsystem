package com.quickman.studentmanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickman.studentmanagement.model.Student;
import com.quickman.studentmanagement.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	//	@GetMapping("{studentId}")
	//	public Student getStudentDetails(String studentId) {
	//		return new Student("2019ICTS137", "Logeesan", "r.logeesan21112@gmail.com", "BICT[Hons]");
	//	}
	
	// Student student;
	
	StudentService studentService;
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping("{studentId}")
	public Student getStudentDetails(@PathVariable("studentId") String studentId) {
		// return student;
		return studentService.getStudent(studentId);
	}
	
	@GetMapping
	public List<Student> getAllStudentDetails() {
		// return student;
		return studentService.getAllStudent();
	}
	
	@PostMapping
	public String createStudentDetails(@Valid @RequestBody Student Student) {
		// this.student = Student;
		studentService.createStudent(Student);
		return "Student was created successfully.";
	}
	
	@PutMapping
	public String updateStudentDetails(@RequestBody Student Student) {
		// this.student = Student;
		studentService.updateStudent(Student);
		return "Student was updated successfully.";
	}
	
	@DeleteMapping("{studentId}")
	public String deleteStudentDetails(@PathVariable("studentId") String studentId) {
		// this.student = null;
		studentService.deleteStudent(studentId);
		return "Student was deleted successfully.";
	}
	
}
