package com.chandankrr.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chandankrr/springcore/stereotype/stereoconfig.xml");
		
		Student s1 = context.getBean("obj", Student.class);
		
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		Student s2 = context.getBean("obj", Student.class);
		
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
//		using xml: changing the bean scope from singleton to prototype
		Teacher t1 = context.getBean("teacher", Teacher.class);
		Teacher t2 = context.getBean("teacher", Teacher.class);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

	}

}
