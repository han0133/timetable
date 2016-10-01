package com.timetable.config.document;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;

public class SubjectDomain {
	@Id
    String id;
    
    String code;
    String name;
    int credit;
    int classes;
    String lectureRoom;
    String professor;
    String type;
    List<Object> time;
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getClasses() {
		return classes;
	}

	public void setClasses(int classes) {
		this.classes = classes;
	}

	public String getLectureRoom() {
		return lectureRoom;
	}

	public void setLectureRoom(String lectureRoom) {
		this.lectureRoom = lectureRoom;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Object> getTime() {
		return time;
	}

	public void setTime(List<Object> time) {
		this.time = time;
	}

	public SubjectDomain(String code, String name, int credit, int classes, String lectureRoom, String professor, String type, Map<String, Object> time){
        this.name = name;
        this.code = code;
        this.credit = credit;
        this.classes = classes;
        this.lectureRoom = lectureRoom;
        this.professor = professor;
        this.type = type;
        this.time = (List<Object>) time;
    }
 
    @Override
    public String toString() {
        return String.format("[id = %s, code = %s, name = %s, credit = %d, classes = %d, lectureRoom = %s, professor = %s, type = %s, time = %s]", id, code, name, credit, classes, lectureRoom, professor, type, time);
    }
}
