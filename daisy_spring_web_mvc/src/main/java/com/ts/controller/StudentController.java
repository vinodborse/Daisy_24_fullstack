package com.ts.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.StudentDetail;
import com.ts.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService sc;

	@GetMapping("/name")
	public String name() {
		return "Vinod";
	}
	
	//localhost:8080/daisy_spring_web_mvc/std-path/6/Don/Pune
	@GetMapping("/std-path/{rn}/{name}/{add}")
	public StudentDetail getStudent(@PathVariable("name") String name, 
			                        @PathVariable("rn") int rollno,
			                        @PathVariable("add") String address) {
		StudentDetail sd = new StudentDetail();
		sd.setRollno(rollno);
		sd.setName(name);
		sd.setAddress(address);
		return sd;
	}

	//https://www.google.co.in/search?q=cricket
	//localhost:8080/daisy_spring_web_mvc/std-req?name=Vinod&rn=9&add=Mumbai
	@GetMapping("/std-req") //localhost:8080/daisy_spring_web_mvc/std-req?name=Vinod
	public StudentDetail getStudentRequest(@RequestParam("name") String name,
										   @RequestParam("rn")	int rollno,
										   @RequestParam("add") String address) {
		StudentDetail sd = new StudentDetail();
		sd.setRollno(rollno);
		sd.setName(name);
		sd.setAddress(address);
		return sd;
	}

	@GetMapping("/std-req-body")
	public StudentDetail getStudentByReqBody(@RequestBody StudentDetail sd) {
		return sd;
	}
	
	
	
	@GetMapping("/all/{rl}") // localhost:8080/daisy_spring_web_mvc/all/4
	public StudentDetail addStudents(@PathVariable("rl") int rollno) {
		

		
		return sc.getStudent(rollno);
	}
}


/*

@PathVariable
@RequestParam
@RequestBody


*/