package com.mytest.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mytest.project.service.NoticeService;
import com.mytest.project.vo.Notice;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class NoticeController {

	@Autowired
	private NoticeService service;
	
	@GetMapping("/notice.do")
	public ModelAndView noticeTest(ModelAndView mv) {
		String noticeTitle = "<h3>게시판 리스트</h3>";
		
		List<Notice> notice = service.noticeList();
		
		log.info("notice= " + noticeTitle);
		mv.setViewName("/notice");
		mv.addObject("nt",noticeTitle);
		return mv;
	}
}
