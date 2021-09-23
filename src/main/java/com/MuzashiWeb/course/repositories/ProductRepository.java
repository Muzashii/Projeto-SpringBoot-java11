package com.MuzashiWeb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MuzashiWeb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	
}
