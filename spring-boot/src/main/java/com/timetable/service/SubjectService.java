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
	
	public List<Subject> getAll(){
		return repository.findAll();
	}
}
