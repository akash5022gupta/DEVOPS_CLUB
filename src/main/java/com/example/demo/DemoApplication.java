package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
// Create a simple controller
    @RestController
    public static class HelloController {

        // Map a GET request to /hello
        @GetMapping("/hello")
        public String hello() {
            return "Hello from Spring Boot!";
        }
    }
}
