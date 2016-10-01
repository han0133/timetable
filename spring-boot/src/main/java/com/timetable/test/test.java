package com.timetable.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.timetable.config.document.Subject;
import com.timetable.config.document.SubjectRepository;

@Controller
public class test {
	
	@Autowired
	private SubjectRepository repository;

	@RequestMapping("/test")
	public String testMethod(Model model){
		
		for(Subject subject : this.repository.findAll()){
			System.out.println(subject);
			//model.addAttribute("", );
		}
		
		return "test/test.html";
	}
}