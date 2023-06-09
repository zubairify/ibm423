package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibm.entity.Movie;
import com.ibm.repo.MovieRepository;
import com.ibm.vo.CinemaTemplate;
import com.ibm.vo.Director;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieRepository repo;
	
	@Autowired
	private RestTemplate rest;
	
	@Override
	public Movie save(Movie m) {
		return repo.save(m);
	}

	@Override
	public Movie find(int id) {
		return repo.findById(id).get();
	}

	@Override
	public CinemaTemplate details(int id) {
		CinemaTemplate cinema = new CinemaTemplate();
		
		Movie m = repo.findById(id).get();
		Director d = rest.getForObject("http://DIRECTOR-SERVICE/director/"+m.getDirid(), Director.class);
		
		cinema.setDirector(d);
		cinema.setMovie(m);
		return cinema;
	}
}
