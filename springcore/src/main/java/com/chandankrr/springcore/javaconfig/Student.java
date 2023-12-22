package com.chandankrr.springcore.javaconfig;

public class Student {
	private Address address;
	
	public Student(Address address) {
		super();
		this.address = address;
	}

	public void study() {
		this.address.display();
		System.out.println("Student is reading a book.....");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
