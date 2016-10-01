package com.timetable.config.document;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepository extends MongoRepository<Subject, String>{

	Subject findByCode(String code);
	
	List<Subject> findByName(String name);
	
}