package com.ibm.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/directorFallback")
	public String directorServiceFallback() {
		return "Director service is taking longer than expected\nPlease try after sometime";
	}
	
	@GetMapping("/movieFallback")
	public String movieServiceFallback() {
		return "Movie service is taking longer than expected\nPlease try after sometime";
	}
}
