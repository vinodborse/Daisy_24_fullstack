package com.ts;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	
	@Autowired
	Employee e;
			
	public void userData() {
		System.out.println("We are in userData method...");
		e.employeeData();
	}
}
