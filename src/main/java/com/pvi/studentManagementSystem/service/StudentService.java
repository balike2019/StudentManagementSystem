package com.pvi.studentManagementSystem.service;

import java.util.List;

import com.pvi.studentManagementSystem.entity.Student;

public interface StudentService {
	
List<Student>getAllStudents();

Student saveStudent(Student student);

Student getStudentById(Long id);

Student updateStudent(Student student);

public void deleteStudentById(Long id);

}
