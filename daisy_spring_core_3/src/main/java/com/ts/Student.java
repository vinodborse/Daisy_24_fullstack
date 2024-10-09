package com.ts;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	Batch b;
	
	@Autowired
	Teacher tch;
	
	public void hello() {
		System.out.println("Student name is Vinod");
		b.batchName();
		tch.test();
	}
}
