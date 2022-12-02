package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	

	@GetMapping("/")
	public String index() {

		string userId = "kcrismon";
		string password = "KnownPassword1234!";
	
		return "Greetings from Spring Boot!";
	}

}
