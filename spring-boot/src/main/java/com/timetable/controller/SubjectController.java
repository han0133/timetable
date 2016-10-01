package com.timetable.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.timetable.config.document.Subject;
import com.timetable.config.document.SubjectRepository;

@Controller
public class SubjectController {
	
	@Autowired
	private SubjectRepository repository;

	@RequestMapping("/timetable")
	public String testMethod(Model model){
		
		//과목 list를 담을 list 생성
		List<Subject> subject = new ArrayList<Subject>();
		
		//repository에서 가져온 값을 순서대로 subject에 담는다
		for(Subject subjectTemp : this.repository.findAll()){
			System.out.println(subjectTemp);
			subject.add(subjectTemp);
		}
		
		model.addAttribute("subject", subject);
		return "/testVelocity";
	}
}