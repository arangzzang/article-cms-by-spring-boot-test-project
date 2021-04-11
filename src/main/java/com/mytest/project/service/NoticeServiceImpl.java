package com.mytest.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytest.project.dao.NoticeDao;
import com.mytest.project.mapper.NoticeTable;
import com.mytest.project.vo.Notice;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private NoticeDao dao;
	@Autowired
	private NoticeTable nt;
	
	@Override
	public List<Notice> noticeList() {
		return dao.noticeList(nt);
	}

}
