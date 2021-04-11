package com.mytest.project.dao;

import java.util.List;

import com.mytest.project.mapper.NoticeTable;
import com.mytest.project.vo.Notice;

public interface NoticeDao {

	List<Notice> noticeList(NoticeTable nt);
}
