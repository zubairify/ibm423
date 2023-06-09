package com.ibm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Director;
import com.ibm.service.DirectorService;

@RestController
@RequestMapping("/director")
public class DirectorController {

	@Autowired
	private DirectorService service;
	
	@PostMapping(value = "/", consumes = "application/json")
	public String saveDirector(@RequestBody Director dir) {
		service.save(dir);
		return "Director saved.";
	}
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public Director getDirector(@PathVariable int id) {
		return service.find(id);
	}
}
