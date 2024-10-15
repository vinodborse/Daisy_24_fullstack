package com.ts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teacher {

	@GetMapping("/tc")
	public String teacherName() {
		return "Vinod";
	}
}
