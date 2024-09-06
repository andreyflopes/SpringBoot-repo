package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.UsuarioEntity;
import com.example.demo.services.UsuarioService;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/get")
    public ResponseEntity<?> getTimes() {
        var users = usuarioService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping("/post")
    public ResponseEntity<?> postUsers(@RequestBody String usuario) {
        
        
        return null;
        
        
       
    }
    
}
