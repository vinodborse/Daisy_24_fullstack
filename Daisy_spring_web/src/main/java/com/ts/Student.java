package com.ts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController // @Controller + @ResponseBody
public class Student {

/*	
	//Use this if you are using @Controller
	
	@GetMapping("/pwd")
	public @ResponseBody String test () {
		return "Hello User";
	}
*/	
	
	@GetMapping("/data")
	public String stdData() {
		return "We are in stdData method";
	}
}



//@Component

//@Controller

//@Service

//@Repository


//doGet      @GetMapping
//doPost     @PostMapping
//doDelete   @DeleteMapping
//doUpdate   @PutMapping