package com.quickman.studentmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="student_record")
public class Student {
	
	@Id
	@NotEmpty(message = "studentId must not be empty")
	private String studentId;
	@NotEmpty(message = "studentName must not be empty")
	private String studentName;
	@NotEmpty(message = "studentEmail must not be empty")
    private String studentEmail;
	@NotEmpty(message = "studentCourse must not be empty")
    private String studentCourse;
    
    public Student() {
		super();
	}
    
	public Student(String studentId, String studentName, String studentEmail, String studentCourse) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentCourse = studentCourse;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
    
}
