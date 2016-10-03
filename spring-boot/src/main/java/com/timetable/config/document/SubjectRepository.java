package com.timetable.config.document;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends MongoRepository<Subject, String>, SubjectRepositoryCustom{
	public List<Subject> findByCode(String code);
	public List<Subject> findById(String id);
	public List<Subject> findByType(String type);
}