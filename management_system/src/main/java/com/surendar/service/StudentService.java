package com.surendar.service;

import java.util.List;

import com.surendar.entity.Student;

public interface StudentService {

	Student createStudent(Student s);
	List<Student> getAllStudent();
	
}
