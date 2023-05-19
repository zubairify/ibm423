package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Album {
	@Id
	@GeneratedValue
	private int id;
	@Column(length = 20)
	private String title;
	@Column(length = 20)
	private String artist;
	@Column(length = 10)
	private String genre;
	
}
