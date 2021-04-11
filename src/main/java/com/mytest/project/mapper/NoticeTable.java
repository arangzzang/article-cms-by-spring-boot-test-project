package com.mytest.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.mytest.project.vo.Notice;

@Mapper
public interface NoticeTable {

	@Select("select * from notice")
	public List<Notice> selectNotice();
}
