package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expost "/" to return a hello string

    @Value("${tech.name}")
    private String techName;

    @GetMapping("/")
    public String sayHello() {
        return "hello " + techName;
    }
}