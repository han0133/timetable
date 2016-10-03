package com.timetable.config.document;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepositoryCustom {
	public List<Subject> findBySubName(String name);
}
