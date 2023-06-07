package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Team;
import com.ibm.repo.TeamRepository;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamRepository repo;
	
	@Override
	public Team save(Team team) {
		return repo.save(team);
	}

	@Override
	public Team fetch(int teamId) {
		return repo.findById(teamId).get();
	}
}
