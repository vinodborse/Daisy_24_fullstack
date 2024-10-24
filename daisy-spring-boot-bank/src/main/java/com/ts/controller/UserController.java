package com.ts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.service.UserService;

@RestController
@RequestMapping("/api/bank")
public class UserController {
	@Autowired
	UserService userService;

	
}
