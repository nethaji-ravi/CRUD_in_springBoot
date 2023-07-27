package com.student.demo.service;

import java.util.List;

import com.student.demo.entity.student;

public interface student_service {

	List<student> getAllstudent();
	
	student saveStudent(student std);
	
	student getStudentById(Long id);
	student updateStudent(student std);
	void deleteStudentById(Long id);

}
