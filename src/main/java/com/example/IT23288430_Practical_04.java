// Studnet ID: IT23288430
// IT3030 – PAF Practical 04

package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IT23288430_Practical_04 {

    public static void main(String[] args) {
        SpringApplication.run(IT23288430_Practical_04.class, args);
    }

    // Endpoint 1
    @GetMapping("/greet")
    public String greet() {
        return "Have a Nice Day. Welcome to Spring Boot Project!";
    }

    // Endpoint 2 and Endpoint 3
    @GetMapping("/greet/{name}")
    public String greetWithName(@PathVariable String name, @RequestParam(required = false) String message) {
        if (message != null && !message.isEmpty()) {
            return "Hello " + name + "! " + message;
        }
        return "Hello " + name + "! Welcome to Spring Boot Project!";
    }
}


// To run the application, use the command: mvn spring-boot:run

// Endpoint 1: http://localhost:8080/greet
// Endpoint 2: http://localhost:8080/greet/Dhanaja
// Endpoint 3: http://localhost:8080/greet/Dhanaja?message=Hiiii!