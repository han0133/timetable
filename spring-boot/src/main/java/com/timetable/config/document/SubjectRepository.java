package com.timetable.config.document;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepository extends MongoRepository<Subject, String>{

	SubjectDomain findByCode(String code);
	
	List<SubjectDomain> findByName(String name);
	
}