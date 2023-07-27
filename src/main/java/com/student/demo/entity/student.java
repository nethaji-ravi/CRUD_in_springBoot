package com.student.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students_detail")
public class student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long std_id;
	
	@Column(name="first_name",nullable=false)
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="email")
	private String email;
	
	public student() {
		
	}
	
	public student(Long std_id, String first_name, String last_name, String email) {
		super();
		this.std_id = std_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
	
	public Long getStd_id() {
		return std_id;
	}
	public void setStd_id(Long std_id) {
		this.std_id = std_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
