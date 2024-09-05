package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.TimeFutebolRepository;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/time-futebol")
public class TimeFutebolController {
    @Autowired
    TimeFutebolRepository timeFutebolRepository;
    
    @SuppressWarnings("rawtypes")
    @GetMapping("path")
    public ResponseEntity getTimes(@RequestParam String param) {
        timeFutebolRepository.findAll();
        return ResponseEntity.ok().build();
    }
    
}
