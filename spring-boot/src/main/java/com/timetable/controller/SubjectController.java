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

		mav.setViewName("/index");
		
		return mav;
	}
	
	@RequestMapping("/findSubjectByCode")
	public List<Subject> findSubjectByCode(String code){
		System.out.println("code: "+code);
		List<Subject> subjectList = subjectService.findListByCode(code);
		System.out.println("subjectList: "+subjectList);
		return subjectList;
	}
	
	@RequestMapping("/findSubjectById")
	public List<Subject> findSubjectById(String id){
		System.out.println("id: "+id);
		List<Subject> subjectList = subjectService.findListById(id);
		System.out.println("subjectList: "+subjectList);
		return subjectList;
	}
	
	@RequestMapping("/searchDepartments")
	public Departments searchDepartments(String selectedCollege){
	//	System.out.println("searchDepartments Controller 성공");
	//	System.out.println(selectedCollege);
		
		Departments departments= departmentsService.getDepartments(selectedCollege);
	//	System.out.println("departments ::"+departments);
		return departments;
	}
	
	@RequestMapping("/searchSubjectByType")
	public List<Subject> searchSubjectByType(String selectedMajor){
		System.out.println("selectedMajor: "+selectedMajor);
		
		List<Subject> subjectList = subjectService.findListByType(selectedMajor);
		System.out.println(subjectList);
		return subjectList;
	}
	
	@RequestMapping("/searchSubjectByName")
	public List<Subject> searchSubjectByName(String name){
		System.out.println("searchSubjectByName 실행");
		System.out.println("Name: "+name);
		
		List<Subject> subjectList = subjectService.findListByName(name);
		System.out.println(subjectList);
		return subjectList;
	}
}