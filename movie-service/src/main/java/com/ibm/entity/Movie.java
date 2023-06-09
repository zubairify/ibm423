package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
	@Id
	private int movid;
	@Column(length = 20)
	private String name;
	@Column(length = 10)
	private String genre;
	private int dirid;
	
	// Getters & Setters
	public int getDirid() {
		return dirid;
	}
	public void setDirid(int dirid) {
		this.dirid = dirid;
	}
	public int getMovid() {
		return movid;
	}
	public void setMovid(int movid) {
		this.movid = movid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}
