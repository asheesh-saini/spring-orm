package com.ashu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.entity.StudentEntity;
import com.ashu.repository.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping
	public List<StudentEntity> getAllStudents() {
		List<StudentEntity> studentList = studentRepository.getStudentList();
		System.out.println(studentList);
		return studentList;
	}
	@GetMapping("/{id}")
	public StudentEntity getStudentById(@PathVariable("id")String id) {
		System.out.println("id :"+id);
		return studentRepository.getStudentById(id);
	}
	@PostMapping
	public void addStudent(StudentEntity student) {
		// see student repository to correct the method as per requirement
		studentRepository.addStudent(student);
	}
	@PutMapping
	public void updateStudent(StudentEntity student) {
		// see student repository to correct the method as per requirement
		//studentRepository.addStudent(student);
	}
	@DeleteMapping
	public void removeStudent(String i) {
		// see student repository to correct the method as per requirement
		
	}
}
