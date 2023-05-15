package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	@Id
	private int code;
	@Column(length = 30)
	private String description;
	private double price;
	private int stock;
	
	// Constructors
	public Product() {
	}
	public Product(int code, String description, double price, int stock) {
		this.code = code;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + ", stock=" + stock + "]";
	}
	
	// Getters and Setters
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
