package com.timetable.config.document;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class SubjectRepositoryImpl implements SubjectRepositoryCustom {

	@Autowired
	private MongoTemplate mongoTemplate;
	
}
