package com.example.Spring01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring01.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
