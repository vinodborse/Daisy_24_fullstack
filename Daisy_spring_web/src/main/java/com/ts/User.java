package com.ts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {

	@GetMapping("/udata")
	public String userData() {
		
		return "We are in user data method....";
	}
	
	
	@PostMapping("/pdata")
	public String postData() {
		return "We are using POST method";
	}
}
