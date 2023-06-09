package com.ibm.service;

import com.ibm.entity.Movie;
import com.ibm.vo.CinemaTemplate;

public interface MovieService {

	Movie save(Movie m);
	
	Movie find(int id);
	
	CinemaTemplate details(int id);
}
