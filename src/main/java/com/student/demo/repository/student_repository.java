package com.student.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.entity.student;

public interface student_repository extends JpaRepository<student,Long>{

}
