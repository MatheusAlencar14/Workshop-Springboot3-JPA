package com.devjava.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjava.cursojava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
