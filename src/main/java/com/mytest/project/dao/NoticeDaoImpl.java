package com.mytest.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mytest.project.mapper.NoticeTable;
import com.mytest.project.vo.Notice;

@Repository
public class NoticeDaoImpl implements NoticeDao {

	@Override
	public List<Notice> noticeList(NoticeTable nt) {
		return nt.selectNotice();
	}

}
