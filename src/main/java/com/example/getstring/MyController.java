package com.example.getstring;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/")
public class MyController {
     @GetMapping("/")
    public String myController() {
        return "Welcome to Spring Boot";
    }
}