package com.timetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.timetable.service.SubjectService;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@Configuration
public class TimetableApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(TimetableApplication.class, args);
		System.out.println("main");
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		System.out.println("run");
	}
}
