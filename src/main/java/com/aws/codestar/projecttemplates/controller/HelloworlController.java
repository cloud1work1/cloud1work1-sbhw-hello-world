package com.aws.codestar.projecttemplates.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloworlController {
    
    @GetMapping("/")
    public String helloWorldDefault() {
        return "Hello from Cloud9";
    }
}