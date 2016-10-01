package com.timetable;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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
