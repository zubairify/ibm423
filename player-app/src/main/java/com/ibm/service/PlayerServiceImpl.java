package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibm.entity.Player;
import com.ibm.repo.PlayerRepository;
import com.ibm.vo.ResponseTemplate;
import com.ibm.vo.Team;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository repo;
	
	@Autowired
	private RestTemplate rest;
	
	@Override
	public Player save(Player p) {
		return repo.save(p);
	}

	@Override
	public Player fetch(int playerId) {
		return repo.findById(playerId).get();
	}

	@Override
	public ResponseTemplate fetchPlayerWithTeam(int playerId) {
		ResponseTemplate response = new ResponseTemplate();

		Player p = repo.findById(playerId).get();
		
		Team t = rest.getForObject("http://TEAM-SERVICE/team/" + p.getTeamId(), Team.class);
		
		response.setPlayer(p);
		response.setTeam(t);
		return response;
	}
}
