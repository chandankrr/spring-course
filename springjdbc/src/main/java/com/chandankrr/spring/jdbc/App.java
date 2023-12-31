package com.chandankrr.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.chandankrr.spring.jdbc.dao.StudentDao;
import com.chandankrr.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started ........." );
        
        // spring jdbc -> jdbc template
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        // add new student to table
		/*
		 * Student student = new Student(); 
		 * student.setId(555);
		 * student.setName("Shweta Sharma"); 
		 * student.setCity("Jammu");
		 * 
		 * int result = studentDao.insert(student);
		 * System.out.println("Number of students added: " + result);
		 */
        
        // update student data in table
		/*
		 * Student student = new Student(); 
		 * student.setId(555);
		 * student.setName("Neelu Kumari"); 
		 * student.setCity("Patna");
		 * 
		 * int result = studentDao.change(student); System.out.println("Data change: " +
		 * result);
		 */
        
        // deleted student data in table
		/*
		 * int result = studentDao.delete(555); System.out.println("Deleted: " +
		 * result);
		 */
        
        // select single student data
		/*
		 * Student student = studentDao.getStudent(111); System.out.println(student);
		 */
        
        // selecting multiple data of students
        List<Student> students = studentDao.getAllStudents();
        for(Student student : students) {
        	System.out.println(student);
        }
    }
}
