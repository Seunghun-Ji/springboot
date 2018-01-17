package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class MyprojectApplication {
	
	@RequestMapping("/")
	String home() {
		return "Hello World!!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyprojectApplication.class, args);
	}
}
