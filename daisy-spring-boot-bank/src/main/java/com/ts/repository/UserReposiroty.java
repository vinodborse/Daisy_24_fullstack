package com.ts.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ts.model.User;

@Repository
public interface UserReposiroty extends JpaRepository<User, Long>{
	
	
	Optional<User> findByAccountnumber(int accNo); // SELECT * FROM user WHERE accountnumber = ....;

//	@Query(value ="...........", nativeQuery = true )
//	rcdfcdefc(Long id, String name); //SELECT * FROM user WHERE id =... AND name = ...;
}
