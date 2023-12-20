package com.chandankrr.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chandankrr/springcore/constructorinjection/config.xml");
		
		Person p1 = (Person) context.getBean("person");
		System.out.println(p1);
		
		Addition addition = (Addition) context.getBean("addition");
		addition.doSum();
	}
}
