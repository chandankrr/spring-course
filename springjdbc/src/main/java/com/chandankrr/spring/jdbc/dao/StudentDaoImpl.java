package com.chandankrr.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.chandankrr.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		// insert query
		String query = "INSERT into student(id, name, city) values(?, ?, ?)";
		int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return result;
	}
	
	@Override
	public int change(Student student) {
		// updating data
		String query = "UPDATE student set name=?, city=? WHERE id=?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return result;
	}
	
	@Override
	public int delete(int studentId) {
		// delete operation
		String query = "DELETE from student where id=?";
		int result= this.jdbcTemplate.update(query, studentId);
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
