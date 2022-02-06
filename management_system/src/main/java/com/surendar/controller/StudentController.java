package com.surendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.surendar.entity.Student;
import com.surendar.service.impl.StudentServiceImpl;

@Controller
public class StudentController {

	@Autowired
	StudentServiceImpl studentServiceImpl;

	@GetMapping({ "/students", "/" })
	public String showStudents(Model model) {
		System.out.println(studentServiceImpl.getAllStudent());
		model.addAttribute("mystudents", studentServiceImpl.getAllStudent());
		model.addAttribute("student", new Student());

		return "students.html";

	}

	@PostMapping("/createStudent")
	public String addStudents(@ModelAttribute("student") Student stu) {

		studentServiceImpl.createStudent(stu);
		return "redirect:students";
	}
}
