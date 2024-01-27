package com.verbanek.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verbanek.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
