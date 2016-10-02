package com.timetable.config.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "subjects")
public class Subject{
    @Id
    private String id;
    
    private String code;
    private String name;
    private int noPerWeek;
    private int credit;
    private String[] time;
    private String type;
    private String typeDetail;
    private String classroom;
    private String professor;
    private int group;
    
    public void setId(String id) {
		this.id = id;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNoPerWeek(int noPerWeek) {
		this.noPerWeek = noPerWeek;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public void setTime(String[] time) {
		this.time = time;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setTypeDetail(String typeDetail) {
		this.typeDetail = typeDetail;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public String getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public int getNoPerWeek() {
		return noPerWeek;
	}

	public int getCredit() {
		return credit;
	}

	public String[] getTime() {
		return time;
	}

	public String getType() {
		return type;
	}

	public String getTypeDetail() {
		return typeDetail;
	}

	public String getClassroom() {
		return classroom;
	}

	public String getProfessor() {
		return professor;
	}

	public int getGroup() {
		return group;
	}

	public Subject(){
    	
    }
   
    public Subject(String code, String name, int noPerWeek, int credit, String[] time, String type, String typeDetail, String classroom, String professor, int group){
        this.name = name;
        this.code = code;
        this.noPerWeek = noPerWeek;
        this.credit = credit;
        this.time = time;
        this.group = group;
        this.classroom = classroom;
        this.professor = professor;
        this.type = type;
        this.typeDetail = typeDetail;
    }
 
    @Override
    public String toString() {
        return String.format("[id = %s, code = %s, name = %s, noPerWeek = %d, credit = %d, group = %d, ClassRoom = %s, professor = %s, type = %s, typeDetail = %s, time = %s]", id, code, name, noPerWeek, credit, group, classroom, professor, type, typeDetail, time);
    }
} 