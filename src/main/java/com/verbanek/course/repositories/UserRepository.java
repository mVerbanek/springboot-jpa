package com.verbanek.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verbanek.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
