package com.example.demo.forecast.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ForecastController {

    @GetMapping("/forecast")
    public String callForecastApi() {
        StringBuilder result = new StringBuilder();


        return "hello";
    }
}
