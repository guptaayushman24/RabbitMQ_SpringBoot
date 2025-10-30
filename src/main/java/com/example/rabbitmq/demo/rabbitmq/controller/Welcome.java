package com.example.rabbitmq.demo.rabbitmq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/")
    public String welcomeContoller(){
        return "Welcome to the RabbitMQ";
    }
}
