package com.pvi.studentManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pvi.studentManagementSystem.entity.Student;
import com.pvi.studentManagementSystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
@Autowired
private StudentRepository  studentRepository;
	@Override
	public void run(String... args) throws Exception {
		 
	//	Student student1=new Student("Njomi","Balemba","balikegmail.com");
		//studentRepository.save(student1);
		//Student student2=new Student("Mike","Anna","balikegmail.com");
		
	          //  studentRepository.save(student2);
	
	}

}
