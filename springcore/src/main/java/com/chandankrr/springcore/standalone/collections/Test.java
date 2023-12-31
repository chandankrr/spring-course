package com.chandankrr.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chandankrr/springcore/standalone/collections/standalone_config.xml");
		Person p1 = context.getBean("person1", Person.class);
		
		System.out.println(p1.toString());
		System.out.println(p1.getFriends().getClass());
		System.out.println(p1.getFeeStructure().getClass());
		System.out.println(p1.getProperties());
		System.out.println(p1.getProperties().getClass());
	}

}
