package com.student.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.demo.entity.student;
import com.student.demo.repository.student_repository;
import com.student.demo.service.student_service;

@Service
public class student_service_impl implements student_service {

	private student_repository student_repo;
	
	
	
	public student_service_impl(student_repository student_repo) {
		super();
		this.student_repo = student_repo;
	}



	@Override
	public List<student> getAllstudent() {
		// TODO Auto-generated method stub
		return student_repo.findAll();
	}



	@Override
	public student saveStudent(student std) {
		// TODO Auto-generated method stub
		return student_repo.save(std);
	}



	@Override
	public student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return student_repo.findById(id).get();
	}



	@Override
	public student updateStudent(student std) {
		// TODO Auto-generated method stub
		return student_repo.save(std);
	}
	
	@Override
	public void deleteStudentById(Long id) {
		student_repo.deleteById(id);
	}



	

	

}
