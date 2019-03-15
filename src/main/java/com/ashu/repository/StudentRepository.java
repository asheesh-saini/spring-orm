package com.ashu.repository;

import java.util.List;

import com.ashu.entity.StudentEntity;

public interface StudentRepository {
	public List<StudentEntity> getStudentList();

	public StudentEntity getStudentById(String id);

	public void addStudent(StudentEntity student);
}
