package com.example.Spring01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring01.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
