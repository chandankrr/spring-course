package com.chandankrr.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chandankrr.spring.orm.dao.StudentDao;
import com.chandankrr.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chandankrr/spring/orm/config.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean isTrue = true;

		do {
			System.out.println("PRESS 1 for add new student");
			System.out.println("PRESS 2 for display all students");
			System.out.println("PRESS 3 for get details of single student");
			System.out.println("PRESS 4 for delete student");
			System.out.println("PRESS 5 for update student");
			System.out.println("PRESS 6 for exit");

			try {
				System.out.println("\nEnter your choice: ");
				int choice = Integer.parseInt(br.readLine());

				switch (choice) {
				case 1:
					System.out.println("Enter user id: ");
					int id = Integer.parseInt(br.readLine());
					System.out.println("Enter user name: ");
					String name = br.readLine();
					System.out.println("Enter user city: ");
					String city = br.readLine();

					Student student = new Student();
					student.setStudentId(id);
					student.setStudentName(name);
					student.setStudentCity(city);

					int result = studentDao.insert(student);
					System.out.println("Student inserted with id: " + result);
					System.out.println("***********************************");
					System.out.println();
					break;
				case 2:
					System.out.println("----------Students Detail-----------");
					List<Student> allStudents = studentDao.getAllStudents();
					for (Student s : allStudents) {
						System.out.println(s);
					}
					System.out.println("***********************************");
					System.out.println();
					break;
				case 3:
					System.out.println("Enter student id: ");
					int studentId1 = Integer.parseInt(br.readLine());
					Student studentData = studentDao.getStudent(studentId1);
					System.out.println(studentData);
					System.out.println("***********************************");
					System.out.println();
					break;
				case 4:
					System.out.println("Enter student id: ");
					int studentId2 = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(studentId2);
					System.out.println("Student deleted with id: " + studentId2);
					System.out.println("***********************************");
					System.out.println();
					break;
				case 5:
					System.out.println("Enter student id: ");
					int studentId3 = Integer.parseInt(br.readLine());

					System.out.println("Enter 1 to update name");
					System.out.println("Enter 2 to update city");

					int enteredValue = Integer.parseInt(br.readLine());

					// Get the existing student data
					Student studentData1 = studentDao.getStudent(studentId3);

					if (studentData1 == null) {
						System.out.println("Student not found!");
						break;
					}

					if (enteredValue == 1) {
						System.out.println("Enter new name: ");
						String newName = br.readLine();
						studentData1.setStudentName(newName);
					} else if (enteredValue == 2) {
						System.out.println("Enter new city: ");
						String newCity = br.readLine();
						studentData1.setStudentCity(newCity);
					} else {
						System.out.println("Invalid option!");
						break;
					}

					// Update the student in the database
					studentDao.updateStudent(studentData1);
					System.out.println("Student information updated successfully.");
					System.out.println("***********************************");
					System.out.println();
					break;
				case 6:
					isTrue = false;
					break;
				default:
					System.out.println("Invalid choice! Please enter a valid option.");
					break;
				}

			} catch (Exception e) {
				System.out.println("Invalid input!!");
				System.out.println(e.getMessage());
			}
		} while (isTrue);

		System.out.println("\nThankyou for using my application \nsee you soon!!");

	}
}
