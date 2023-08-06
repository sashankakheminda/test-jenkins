package com.example.testjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class Customer {

    @GetMapping("")
    public String getCustomer(){
        return "Welcome to test jenkins";
    }
}
