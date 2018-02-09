package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class MyprojectApplication {
	
	//주소에서 localhost:port 이후에 입력된 내용에 맞게 출력
	@RequestMapping("/demo")
	String home() {
		return "Hello World!!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyprojectApplication.class, args);
	}
}
