package com.chandankrr.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.chandankrr.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	// save student data
	@Transactional
	public int insert(Student student) {
		// insert
		int result = (int) hibernateTemplate.save(student);
		return result;
	}

	// get the single data(object) of student
	public Student getStudent(int studentId) {
		Student student = hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	// get all data of students
	public List<Student> getAllStudents() {
		List<Student> students = hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	// delete student
	@Transactional
	public void deleteStudent(int studentId) {
		Student student = hibernateTemplate.get(Student.class, studentId);
		hibernateTemplate.delete(student);
	}
	
	// update student details
	@Transactional
	public void updateStudent(Student student) {
		hibernateTemplate.update(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
