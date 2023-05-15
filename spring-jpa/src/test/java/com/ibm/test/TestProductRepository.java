package com.ibm.test;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ibm.entity.Product;
import com.ibm.repo.ProductRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestProductRepository {

	@Autowired
	private ProductRepository repo;
	
	@Test
	public void testSave() {
		Product p = new Product(123, "iPhone 13", 54000, 10);
		repo.save(p);
	}
	
	@Test
	public void testFetch() {
		Product p = repo.fetch(123);
		Assertions.assertNotNull(p);
		System.out.println(p);
	}
	
	@Test
	public void testList() {
		List<Product> list = repo.list();
		Assertions.assertFalse(list.isEmpty());
		list.forEach(System.out::println);
	}
}
