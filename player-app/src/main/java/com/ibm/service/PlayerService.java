package com.ibm.service;

import com.ibm.entity.Player;
import com.ibm.vo.ResponseTemplate;

public interface PlayerService {

	Player save(Player p);
	
	Player fetch(int playerId);
	
	ResponseTemplate fetchPlayerWithTeam(int playerId);
}
