package com.timetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.timetable.config.document.Subject;
import com.timetable.config.document.SubjectRepository;

@SpringBootApplication
public class TimetableApplication implements CommandLineRunner{

	@Autowired
	private SubjectRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(TimetableApplication.class, args);
		System.out.println("main");
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		System.out.println("run");
		
		for(Subject subject : this.repository.findAll()){
			System.out.println(subject);
		}
		System.out.println();
		for(Subject subject : this.repository.findByName("영미문학")){
			System.out.println(subject);
		}
	}
}
