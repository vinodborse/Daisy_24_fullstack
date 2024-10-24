package com.ts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.model.User;

@Repository
public interface UserReposiroty extends JpaRepository<User, Long>{

}
