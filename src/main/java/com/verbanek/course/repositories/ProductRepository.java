package com.verbanek.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verbanek.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
