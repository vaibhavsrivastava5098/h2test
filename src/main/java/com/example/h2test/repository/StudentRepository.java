package com.example.h2test.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.h2test.model.Student;  
public interface StudentRepository extends CrudRepository<Student, Integer>  
{  
}  
