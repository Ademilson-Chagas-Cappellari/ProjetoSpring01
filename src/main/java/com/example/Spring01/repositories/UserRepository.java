package com.example.Spring01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring01.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
