package com.ts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.repository.UserReposiroty;

@Service
public class UserService {
	@Autowired
	UserReposiroty userReposiroty;
}
