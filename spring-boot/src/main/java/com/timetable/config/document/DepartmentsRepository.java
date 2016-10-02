package com.timetable.config.document;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentsRepository extends MongoRepository<Departments, String> {
	
	public Departments findByCollegeName(String collegeName);
}
