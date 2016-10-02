package com.timetable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timetable.config.document.Departments;
import com.timetable.config.document.DepartmentsRepository;

@Service
public class DepartmentsService {
	
	@Autowired
	private DepartmentsRepository repository;
	
	public Departments getDepartments(String collegeName){
		repository.findByCollegeName(collegeName);
		System.out.println(repository.findByCollegeName(collegeName));
		
		return repository.findByCollegeName(collegeName);
	}
	
	
}
