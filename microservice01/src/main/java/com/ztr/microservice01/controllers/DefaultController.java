package com.ztr.microservice01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/microservice1")
public class DefaultController {
    @GetMapping("/")
    public String hello() {
        return "Hello, Soy microservicio 1!";
    }
}