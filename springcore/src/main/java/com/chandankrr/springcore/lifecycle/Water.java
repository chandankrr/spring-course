package com.chandankrr.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Water {
	private double price;

	public Water() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Starting method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Terminating method");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Water [price=" + price + "]";
	}
}
