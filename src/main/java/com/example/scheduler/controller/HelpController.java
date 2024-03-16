package com.example.scheduler.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelpController {
    @GetMapping("/greeting")
    String helloGreeting() {
        return "Hello! It's a greeting page from your web service (test response).";
    }

}
