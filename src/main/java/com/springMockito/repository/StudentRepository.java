package com.springMockito.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springMockito.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {


}
