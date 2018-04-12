package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class HelloWorldApiApplication {

	@RequestMapping("/")
	String home() {
		return"index.html";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApiApplication.class, args);
	}
}
