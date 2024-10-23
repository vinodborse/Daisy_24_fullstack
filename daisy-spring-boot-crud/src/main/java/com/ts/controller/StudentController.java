package com.ts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Student;
import com.ts.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentService ss;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return ss.addStudent(student);
	}
	
	@GetMapping("/all-students")
	public List<Student> getAll() {
		return ss.getAll();
	}
	
	@GetMapping("/student")
	public Student getStudent(@RequestParam("rl") Long rollno) {
		return ss.getStudent(rollno);
	}
	
	@PutMapping("/update-student")
	public Student updateStudent(@RequestBody Student student) {
		return ss.updateStudent(student);
	}
	
	@DeleteMapping("/delete-student")
	public String deleteStudent(@RequestParam("rl") Long rollno) {
		return ss.deleteStudent(rollno);
	}
}
