package com.verbanek.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verbanek.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}
