package com.chandankrr.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Student {
	@Value("Chandan")
	private String name;
	@Value("Patna")
	private String city;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	
	
}
