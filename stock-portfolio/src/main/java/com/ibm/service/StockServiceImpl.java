package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Stock;
import com.ibm.repo.StockRepository;

@Service
public class StockServiceImpl implements StockService {
	
	@Autowired
	private StockRepository repo;
	
	@Override
	public int addStock(Stock s) {
		repo.save(s);
		return s.getSid();
	}

	@Override
	public Stock getStock(int sid) {
		return repo.findById(sid).get();
	}

	@Override
	public List<Stock> list() {
		return repo.findAll();
	}
}
