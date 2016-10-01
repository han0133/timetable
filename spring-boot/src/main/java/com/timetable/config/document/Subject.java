package com.timetable.config.document;

import org.springframework.data.annotation.Id;

public class Subject {
    @Id
    String id;
    
    String code;
    String name;
    int credit;
    int classes;
    String lectureRoom;
    String professor;
    String type;
    String time;
    
    public Subject(){
    	
    }
   
    public Subject(String code, String name, int credit, int classes, String lectureRoom, String professor, String type, String time){
        this.name = name;
        this.code = code;
        this.credit = credit;
        this.classes = classes;
        this.lectureRoom = lectureRoom;
        this.professor = professor;
        this.type = type;
        this.time = time;
    }
 
    @Override
    public String toString() {
        return String.format("[id = %s, code = %s, name = %s, credit = %d, classes = %d, lectureRoom = %s, professor = %s, type = %s, time = %s]", id, code, name, credit, classes, lectureRoom, professor, type, time);
    }
} 