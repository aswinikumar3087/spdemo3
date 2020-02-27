package com.harman.SpringbootDemo3.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
    @GetMapping("/sayHello")
    public String getMsg(){
        return "Hello";
    }
}
