package com.student.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.demo.entity.student;
import com.student.demo.service.student_service;

//import ch.qos.logback.core.model.Model;


@Controller
public class student_controller {

	private student_service studentService;

	public student_controller(student_service studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		System.out.println("jello");
		System.out.println(studentService.getAllstudent());
		model.addAttribute("std",studentService.getAllstudent());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model){
		 student std =new student();
		 model.addAttribute("student",std);
		 return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") student student){
		System.out.println("saveStudent()");
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
	
		model.addAttribute("student",studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") student student,Model model) {
		
		student existingStudent = studentService.getStudentById(id);
		existingStudent.setStd_id(id);
		existingStudent.setFirst_name(student.getFirst_name());
		existingStudent.setLast_name(student.getLast_name());
		existingStudent.setEmail(student.getEmail());
		
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
		
	}
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
	
	
}
