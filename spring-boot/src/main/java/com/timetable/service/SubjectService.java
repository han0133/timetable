package com.timetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timetable.config.document.Subject;
import com.timetable.config.document.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepository repository;
	
	public List<Subject> findListByCode(String code){
		return repository.findByCode(code);
	}
	
	public List<Subject> findListById(String id){
		return repository.findById(id);
	}
	
	public List<Subject> getAll(){
		return repository.findAll();
	}
	
	public List<Subject> findListByType(String type){
		return repository.findByType(type);
	}
	
	public List<Subject> findListByName(String name){
		return repository.findBySubName(name);
	}
}
