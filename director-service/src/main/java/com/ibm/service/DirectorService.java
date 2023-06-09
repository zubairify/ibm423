package com.ibm.service;

import com.ibm.entity.Director;

public interface DirectorService {

	Director save(Director d);
	
	Director find(int dirid);
	
}
