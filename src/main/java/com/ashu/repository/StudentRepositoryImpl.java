package com.ashu.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ashu.entity.StudentEntity;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

	@PersistenceContext
	private EntityManager manager;

	@SuppressWarnings("unchecked")
	@Override
	public List<StudentEntity> getStudentList() {
		//System.out.println("entity : "+ manager);
		Query query = manager.createQuery("FROM StudentEntity");// here give entity class name to map the query 
		//System.out.println("query : "+query.getResultList());
		return query.getResultList();
	}
}
