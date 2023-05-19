package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Portfolio;
import com.ibm.repo.PortfolioRepository;

@Service
public class PortfolioServiceImpl implements PortfolioService {

	@Autowired
	private PortfolioRepository repo;
	
	@Override
	public int addPortfolio(Portfolio p) {
		repo.save(p);
		return p.getPid();
	}

	@Override
	public Portfolio getPortfolio(int pid) {
		return repo.findById(pid).get();
	}

	@Override
	public List<Portfolio> list() {
		return repo.findAll();
	}
}
