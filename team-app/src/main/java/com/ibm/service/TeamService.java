package com.ibm.service;

import com.ibm.entity.Team;

public interface TeamService {
	
	Team save(Team team);
	
	Team fetch(int teamId);
}
