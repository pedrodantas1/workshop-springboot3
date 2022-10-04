package com.pedrodantas1.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrodantas1.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}