package com.devjava.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjava.cursojava.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
