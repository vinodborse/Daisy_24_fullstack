package com.ts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.User;
import com.ts.service.UserService;

@RestController
@RequestMapping("/api/bank")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userService.register(user);
	}

	@PutMapping("/own-deposit")
	public String addBalance(@RequestParam("accno") int accNo, @RequestParam("amount") int amount) {
		return userService.addBalance(accNo, amount);
	}
	
	// transfer amount (to other)
	
	// check balance
	
	// delete account
}
