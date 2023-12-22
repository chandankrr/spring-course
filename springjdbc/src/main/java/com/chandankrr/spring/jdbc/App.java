package com.chandankrr.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.chandankrr.spring.jdbc.dao.StudentDao;
import com.chandankrr.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started ........." );
        
        // spring jdbc -> jdbc template
        ApplicationContext context = new ClassPathXmlApplicationContext("com/chandankrr/spring/jdbc/config.xml");
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        Student student = new Student();
        student.setId(555);
        student.setName("Shweta Sharma");
        student.setCity("Jammu");
        
        int result = studentDao.insert(student);
        System.out.println("Number of students added: " + result);
    }
}
