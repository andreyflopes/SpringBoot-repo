package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Usuario;
import com.example.demo.entities.UsuarioEntity;
import com.example.demo.repository.UsuarioRepository;



@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    public List<UsuarioEntity> getAllUsers(){
       return usuarioRepository.findAll();
    }

    @Autowired
   public List<UsuarioEntity> add(String usuario){
    return this.usuarioRepository.add(usuario);
    
   }

  
}
