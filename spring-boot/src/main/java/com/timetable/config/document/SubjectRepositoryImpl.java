package com.timetable.config.document;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class SubjectRepositoryImpl implements SubjectRepositoryCustom {

	@Autowired
	private MongoOperations mongoOps;

	@Override
	public List<Subject> findBySubName(String name) {
		
		Query query = new Query();
	//	query.limit(10);
		query.addCriteria(Criteria.where("name").regex(name));

		return mongoOps.find(query, Subject.class);
	}
	
}