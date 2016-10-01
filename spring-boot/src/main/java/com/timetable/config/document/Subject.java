package com.timetable.config.document;

import org.springframework.data.annotation.Id;

public class Subject {
    @Id
    String id;
    
    String code;
    String name;
    
    public Subject(){
    	
    }
   
    public Subject(String code, String name){
        this.name = name;
        this.code = code;
    }
 
    @Override
    public String toString() {
        return String.format("[id = %s, code = %s, name = %s]", id, code, name);
    }
} 