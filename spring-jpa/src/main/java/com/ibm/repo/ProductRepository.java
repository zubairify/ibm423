package com.ibm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ibm.entity.Product;

@Repository
public class ProductRepository {

	@PersistenceContext(unitName = "MyJPA")
	private EntityManager em;
	
	@Transactional
	public void save(Product p) {
		em.persist(p);
	}
	
	public Product fetch(int code) {
		return em.find(Product.class, code);
	}
	
	public List<Product> list() {
		return em.createQuery("from Product").getResultList();
	}
}
