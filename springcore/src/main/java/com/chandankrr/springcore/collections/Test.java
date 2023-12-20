package com.chandankrr.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/chandankrr/springcore/collections/collectionconfig.xml");
		
		Employee employee1=(Employee) context.getBean("employee1");
		
		System.out.println(employee1.getName());
		System.out.println(employee1.getPhones());
		System.out.println(employee1.getAddresses());
		System.out.println(employee1.getCourses());
	}
}
