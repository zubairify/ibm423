package com.ibm.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	// URL: http://localhost:8880/hello
	@GetMapping(value = "/hello")
	public String sayHello() {
		return "Hello Spring Boot";
	}
	
	@PostMapping(value = "/hello")
	public String sayPostHello() {
		return "Hello Post Spring Boot";
	}
	
	@PutMapping(value = "/hello")
	public String sayPutHello() {
		return "Hello Put Spring Boot";
	}
	
	@DeleteMapping(value = "/hello")
	public String sayDeleteHello() {
		return "Hello Delete Spring Boot";
	}
}
