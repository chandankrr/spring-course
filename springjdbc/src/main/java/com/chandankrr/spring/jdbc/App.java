package com.chandankrr.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started ........." );
        
        // spring jdbc -> jdbc template
        ApplicationContext context = new ClassPathXmlApplicationContext("com/chandankrr/spring/jdbc/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        
        // insert query
        String query = "INSERT into student(id, name, city) values(?,?,?)";
        
        // fire the query
        int result = template.update(query, 333, "Harsh Kumar", "Delhi");
        System.out.println("Number of record inserted: " + result);
    }
}
