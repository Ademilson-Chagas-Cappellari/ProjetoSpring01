package com.example.Spring01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring01.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
