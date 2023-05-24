package com.example.demo.tide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TideController {
    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }
}
