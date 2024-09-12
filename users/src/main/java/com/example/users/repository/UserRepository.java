package com.example.users.repository;


import org.springframework.stereotype.Repository;

import com.example.users.entities.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

  
    
}
