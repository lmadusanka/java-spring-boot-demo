package com.example.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @GetMapping("")
    public String welcome() {
        return "Welcome to Spring Boot " + new Date();
    }

}
