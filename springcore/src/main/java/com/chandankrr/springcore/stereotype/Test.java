package com.chandankrr.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chandankrr/springcore/stereotype/stereoconfig.xml");
		
		Student s1 = context.getBean("obj", Student.class);
		
		System.out.println(s1);
	}

}
