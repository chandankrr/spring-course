package com.chandankrr.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		// using XML
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/chandankrr/springcore/lifecycle/config.xml");
		
		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);
		
		context.registerShutdownHook();
		
		// using interfaces
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		// using annotations
		Water w1 = (Water) context.getBean("w1");
		System.out.println(w1);
	}
}
