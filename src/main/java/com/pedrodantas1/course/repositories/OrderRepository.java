package com.pedrodantas1.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrodantas1.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}