package com.devjava.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjava.cursojava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
