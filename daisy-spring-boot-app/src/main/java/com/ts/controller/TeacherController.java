package com.ts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Teacher;
import com.ts.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	TeacherService ts;

	@GetMapping("/tch")
	public Teacher getTeacher() {
		return ts.getTch();
	}
}
