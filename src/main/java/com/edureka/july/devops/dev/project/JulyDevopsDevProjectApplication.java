package com.edureka.july.devops.dev.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JulyDevopsDevProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JulyDevopsDevProjectApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "<h1>Hello There!!! Welcome to my project</h1>";
	}
}
