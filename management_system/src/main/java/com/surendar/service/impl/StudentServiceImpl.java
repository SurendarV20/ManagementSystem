package com.surendar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.surendar.entity.Student;
import com.surendar.repository.StudentRepository;
import com.surendar.service.StudentService;
@Component
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepo;
	@Override
	public Student createStudent(Student stu) {
	Student s=	studentRepo.save(stu);
		return s;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		 List<Student> students= studentRepo.findAll();
		 return students;
	}

}
