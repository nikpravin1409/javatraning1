package com.example.demomethod;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

//	Student getStudent() {
//		
//	}
	@Autowired
	private StudentRepository stud;
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){

		
		return stud.findAll();
	}
	
	
}