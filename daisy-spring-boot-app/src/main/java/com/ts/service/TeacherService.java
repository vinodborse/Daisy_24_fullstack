package com.ts.service;

import org.springframework.stereotype.Service;

import com.ts.model.Teacher;

@Service
public class TeacherService {

	public Teacher getTch() {
		Teacher tch = new Teacher();
		tch.setId(1);
		tch.setName("Vinod");
		tch.setAddress("Pune");
		
		return tch;
	}
}
