package com.ibm.vo;

import com.ibm.entity.Player;

public class ResponseTemplate {
	
	private Player player;
	private Team team;
	
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}

	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
}
