package com.chandankrr.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chandankrr.spring.orm.dao.StudentDao;
import com.chandankrr.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chandankrr/spring/orm/config.xml");
		
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		
		Student student = new Student(113, "Chandan Kumar", "Patna");
		int result = studentDao.insert(student);
		System.out.println("inserted student_id: " + result);
	}
}
