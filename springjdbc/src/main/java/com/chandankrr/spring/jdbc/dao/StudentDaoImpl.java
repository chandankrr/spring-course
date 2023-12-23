package com.chandankrr.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.chandankrr.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
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
	
	@Override
	public Student getStudent(int studentId) {
		// select single student data
		String query = "SELECT * FROM student WHERE id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}
	
	@Override
	public List<Student> getAllStudents() {
		// select all student data
		String query = "SELECT * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
