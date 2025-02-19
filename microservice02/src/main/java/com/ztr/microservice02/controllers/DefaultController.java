package com.ztr.microservice02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/microservice2")
public class DefaultController {
    @GetMapping("/")
    public String hello() {
        return "Hello, Soy microservicio 2!";
    }
}