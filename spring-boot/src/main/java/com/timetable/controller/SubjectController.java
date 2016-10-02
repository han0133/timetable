package com.timetable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.timetable.config.document.Departments;
import com.timetable.config.document.Subject;
import com.timetable.service.DepartmentsService;
import com.timetable.service.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@Autowired
	private DepartmentsService departmentsService;
	
	@RequestMapping("/timetable")
	public ModelAndView index(ModelAndView mav){

		List<Subject> subList = subjectService.getAll();
		//System.out.println(subList.size());
		
		mav.addObject("subject", subList);
		mav.setViewName("/index");
		
		return mav;
	}
	
	@RequestMapping("/addSubject")
	public List<Subject> addSubject(String code){
		System.out.println("code: "+code);
		List<Subject> subjectList = subjectService.findListByCode(code);
		System.out.println("subjectList: "+subjectList);
		return subjectList;
	}
	
	@RequestMapping("/searchDepartments")
	public Departments searchDepartments(String selectedCollege){
		System.out.println("searchDepartments Controller 성공");
		System.out.println(selectedCollege);
		
		Departments departments= departmentsService.getDepartments(selectedCollege);
		System.out.println("departments ::"+departments);
		return departments;
	}
}