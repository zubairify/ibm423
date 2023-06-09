package com.ibm.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/teamFallback")
	public String teamServiceFallback() {
		return "Team service is taking longer than expected\nPlease try after sometime";
	}
	
	@GetMapping("/playerFallback")
	public String playerServiceFallback() {
		return "Player service is taking longer than expected\nPlease try after sometime";
	}
}
