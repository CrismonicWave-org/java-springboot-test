package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private string userId = "kcrismon";
	private string password = "KnownPassword1234!";
	
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
