package com.springMockito.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springMockito.entity.Student;
import com.springMockito.service.StudentService;

@Controller
public class HomeController {

	@Autowired
	private StudentService stdService;

	@GetMapping("/")
	public String index() {

		return "index";
	}

	@GetMapping("/profile")
	public String profile() {

		List<Student> list = stdService.getAllStudent();

		/*
		 * for (Student stList : list) {
		 * 
		 * System.out.println("Name: " + stList.getName()); }
		 */
		
		Student st = stdService.getById(6);
		System.out.println("Id 6: "+st.getName());
		
		return "profile";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute Student st) {

		System.out.println("Name: " + st.getName());
		//System.out.println("subject: " + sub);

		stdService.saveStudent(st);
		
		//stdService.deleteStudent(1);
		
		

		return "redirect:/profile";
	}

}
