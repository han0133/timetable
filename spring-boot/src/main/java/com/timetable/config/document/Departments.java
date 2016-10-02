package com.timetable.config.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "depts")
public class Departments {
	@Id
	private String id;
	
	private String collegeNo;
	private String collegeName;
	private String[] departments;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCollegeNo() {
		return collegeNo;
	}
	public void setCollegeNo(String collegeNo) {
		this.collegeNo = collegeNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String[] getDepartments() {
		return departments;
	}
	public void setDepartments(String[] departments) {
		this.departments = departments;
	}
	
	public Departments(){
		
	}
	
	public Departments(String collegeNo, String collegeName, String[] departments, String id){
		this.collegeName = collegeName;
		this.collegeNo = collegeNo;
		this.departments = departments;
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return String.format("[id = %s, collegeNo = %s, collegeName = %s, departments= %s]", id, collegeNo, collegeName, departments );  	
	}
}
