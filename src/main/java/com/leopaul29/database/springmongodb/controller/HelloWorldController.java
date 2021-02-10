package com.leopaul29.database.springmongodb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/sayhello")
    public String sayHelloWorld(){
        return "Hello World!";
    }
}
