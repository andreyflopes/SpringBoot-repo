package com.example.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.users.entities.UserEntity;
import com.example.users.repository.UserRepository;





@Service
public class UserService {
    @Autowired
      UserRepository userRepository;
    public List<UserEntity> getAllUsers(){
       return userRepository.findAll();
    }

    public UserEntity UserAdd(@RequestBody UserEntity user){
        return userRepository.save(user);
    }

   
}

  

