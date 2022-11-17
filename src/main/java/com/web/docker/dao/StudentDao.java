package com.web.docker.dao;

import com.web.docker.model.Student;

import java.util.List;



public interface StudentDao {
	
	public void addStudent(Student student);

	public List<Student> getAllStudents();

	}
