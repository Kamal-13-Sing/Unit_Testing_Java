package com.springMockito.service;

import java.util.List;

import com.springMockito.entity.Student;

public interface StudentService {
	
	public Student saveStudent(Student st);
	
	public boolean deleteStudent(int id);
	
	public List<Student> getAllStudent();
	
	public Student getById(int id);
	
	public Student findByUserName(String name);
	
}
