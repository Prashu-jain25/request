package com.practice.learningapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestController {

    @GetMapping
    public String hello() {
        return "API is running";
    }



}
