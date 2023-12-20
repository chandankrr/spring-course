package com.chandankrr.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chandankrr/springcore/autowire/autoconfig.xml");
		
		Employee emp1 = (Employee) context.getBean("employee1");
		
		System.out.println(emp1);
	}

}
