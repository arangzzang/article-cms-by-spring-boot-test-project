package com.mytest.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.mytest.project.member.vo.Member;

@Mapper
public interface MemberTable {

	@Select("select * from member")
	public List<Member> selectAllMembers();
}
