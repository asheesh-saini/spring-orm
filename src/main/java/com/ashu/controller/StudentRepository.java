package com.ashu.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentRepository {

	@PersistenceContext
	private EntityManager manager;
	@RequestMapping("/home")
	public String home() {
		System.out.println("Manager :  "+manager);
		//manager.create
		return "yes";
	}
}
