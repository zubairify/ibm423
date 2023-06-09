package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "directors")
public class Director {
	@Id
	private int dirid;
	@Column(length = 20)
	private String name;
	@Column(length = 15)
	private String region;
	
	// Getters & Setters
	public int getDirid() {
		return dirid;
	}
	public void setDirid(int dirid) {
		this.dirid = dirid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
}
