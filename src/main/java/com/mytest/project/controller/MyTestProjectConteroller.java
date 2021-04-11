package com.mytest.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mytest.project.service.MemberService;
import com.mytest.project.vo.Member;
import com.mytest.project.vo.Person;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MyTestProjectConteroller {
	
//	private 
	
	@Autowired
	private MemberService service;

	@GetMapping("/test")
	public String testProject() {
		return "Hello World";
	}
	@GetMapping("/person")
	public Person seachPerson() {
		return Person.builder().name("조현").age(29).gender("남").build();
	}
	@GetMapping("/selectMember")
	public List<Member> selectAllMember() {
		return service.selectAllMembers();
	}
	@GetMapping("/members")
	public ModelAndView selectMember(String userId, ModelAndView mv) {
		System.out.println(userId);
		Member m = new Member();
		m.setUserId(userId);
		mv.addObject("user",m);
		mv.setViewName("/");
//		return service.selectMember();
		return mv;
	}
}


