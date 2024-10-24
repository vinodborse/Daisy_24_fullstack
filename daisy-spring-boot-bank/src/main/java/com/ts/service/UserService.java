package com.ts.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.User;
import com.ts.repository.UserReposiroty;

@Service
public class UserService {
	@Autowired
	UserReposiroty userReposiroty;

	public User register(User user) {
		Random random = new Random();
		  

		int accNo = random.nextInt(100000);
		
		user.setAccountnumber(accNo);
		
		return userReposiroty.save(user);
		
		
	}

	public String addBalance(int accNo, int amount) {
		
		Optional<User> user = userReposiroty.findByAccountnumber(accNo);
		
		if(user.isPresent()) {
			int balance =user.get().getBalance() +  amount; // 150 + 50
			
			user.get().setBalance(balance); // 200
			
			userReposiroty.save(user.get());
			return "Your money has been deposited successfully";
		} else {
			return "Please add valid account number.";
		}
	}
}
