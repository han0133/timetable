package com.timetable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.timetable.config.document.Subject;
import com.timetable.service.SubjectService;

@Controller
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping("/timetable")
	public String index(Model model){

		List<Subject> subList = subjectService.getAll();
		System.out.println(subList.size());
		
		for(int i = 0; i<subList.size(); i++){
			System.out.println(subList.get(i).toString());
		}
		
		return "/testVelocity";
	}
}