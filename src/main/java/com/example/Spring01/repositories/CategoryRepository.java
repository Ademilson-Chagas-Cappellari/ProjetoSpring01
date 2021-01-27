package com.example.Spring01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring01.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
