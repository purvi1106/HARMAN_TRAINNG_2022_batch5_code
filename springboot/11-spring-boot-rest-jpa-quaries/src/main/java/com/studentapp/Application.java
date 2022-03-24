package com.studentapp;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.dao.Student;
import com.studentapp.model.dao.StudentRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private StudentRepo studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

//		List<Student> list=studentRepo.findByLastNameNotNull();
//		
//		for(Student s: list) {
//			System.out.println(s);
//		}

//		List<Student> list = studentRepo.findByFirstName("rajiv");
//
//		for (Student s : list) {
//			System.out.println(s);
//		}

		

//		List<Student> list = studentRepo.findByFirstNameContaining("raj");
//
//		for (Student s : list) {
//			System.out.println(s);
//		}
		
		Student student=studentRepo.getStudentByEmailName("rgupta.mtech@gmail.com");
		System.out.println(student);
		
//		studentRepo.save(new Student("rajiv", "gupta", "rgupta.mtech@gmail.com"));
//		studentRepo.save(new Student("rajesh", "kumar", "rajesh22@gmail.com"));
//		studentRepo.save(new Student("ekta", null, "ekta22@gmail.com"));
//		studentRepo.save(new Student("sumit", "kumar", "sukr@gmail.com"));
//		studentRepo.save(new Student("pankaj", "sharma", "ps@gmail.com"));

	}

}
