package com.devjava.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjava.cursojava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
