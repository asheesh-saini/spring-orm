package com.ashu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.entity.StudentEntity;
import com.ashu.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@RequestMapping(value ="/home",produces="application/json")
	public List<StudentEntity> home() {
		List<StudentEntity> studentList = studentRepository.getStudentList();
		System.out.println(studentList);
		return studentList;
	}
}
