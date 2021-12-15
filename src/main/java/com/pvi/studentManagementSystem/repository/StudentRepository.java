package com.pvi.studentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pvi.studentManagementSystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
