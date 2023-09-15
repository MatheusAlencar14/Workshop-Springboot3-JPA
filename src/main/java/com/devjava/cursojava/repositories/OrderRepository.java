package com.devjava.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjava.cursojava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
