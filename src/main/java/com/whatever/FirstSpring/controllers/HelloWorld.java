package com.whatever.FirstSpring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/HW")
    public String get(){
        return "HW";
    }
}
