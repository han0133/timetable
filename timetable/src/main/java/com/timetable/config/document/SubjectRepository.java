package com.timetable.config.document;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepository extends MongoRepository<Subject, String>{

	public Subject findByCode(String code);
	
	public List<Subject> findByName(String name);
}