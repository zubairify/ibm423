package com.ibm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Team;
import com.ibm.service.TeamService;

@RestController
public class TeamController {

	@Autowired
	private TeamService service;
	
	@PostMapping(value = "/team", consumes = "application/json")
	public String addTeam(@RequestBody Team team) {
		service.save(team);
		return "Team Added";
	}
	
	@GetMapping(value = "/team/{id}", produces = "application/json")
	public Team getTeam(@PathVariable int id) {
		return service.fetch(id);
	}
}
