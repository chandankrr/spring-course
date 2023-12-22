package com.chandankrr.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Address getAddress() {
		return new Address();
	}
	
	@Bean(name = {"student", "temp"})
	public Student getStudent() {
		return new Student(getAddress());
	}

}
