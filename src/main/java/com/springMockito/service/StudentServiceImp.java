package com.springMockito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMockito.entity.Student;
import com.springMockito.repository.StudentRepository;

@Service

public class StudentServiceImp implements StudentService{

	@Autowired
	private StudentRepository stdRepo;
	
	@Override
	public Student saveStudent(Student st) {
		
		Student save = stdRepo.save(st);
		
		
		return save;
	}

	@Override
	public boolean deleteStudent(int id) {
		
		Student sDelete = stdRepo.findById(id).get();
		
		
		 stdRepo.delete(sDelete);
		 
		return false;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> list = stdRepo.findAll();
		
		return list;
	}

	@Override
	public Student getById(int id) {
		
		Student st = stdRepo.findById(id).get();
		
		return st;
	}

	@Override
	public Student findByUserName(String name) {
		
		
		
		return null;
	}

}
