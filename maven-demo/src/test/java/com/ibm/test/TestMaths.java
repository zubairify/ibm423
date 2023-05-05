package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ibm.Maths;

public class TestMaths {
	private Maths maths;
	
	@BeforeEach
	public void init() {
		maths = new Maths();
	}
	
	@Test
	public void testAdd() {
		assertEquals(10, maths.add(5, 5));
	}
	
	@Test
	public void testSubs() {
		assertEquals(5, maths.subs(10, 5));
	}
	
	@Test
	public void testValidDiv() {
		assertEquals(2, maths.div(10, 5));
	}
	
	@Test
	public void testInvalidDiv() {
		assertThrows(ArithmeticException.class, () -> maths.div(10, 0));
	}
}
