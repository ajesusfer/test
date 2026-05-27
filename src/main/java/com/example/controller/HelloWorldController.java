package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String getHelloWorld() {
        return "¡Hola Mundo! Bienvenido a la API REST con Spring Boot";
    }

}