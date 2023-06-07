package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {
	@Id
	private int teamId;
	@Column(length = 15)
	private String name;
	@Column(length = 15)
	private String sport;
	
	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", name=" + name + ", sport=" + sport + "]";
	}

	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
}
