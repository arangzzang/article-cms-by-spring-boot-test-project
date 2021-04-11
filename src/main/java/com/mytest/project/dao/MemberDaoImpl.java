package com.mytest.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mytest.project.mapper.MemberTable;
import com.mytest.project.vo.Member;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Override
	public List<Member> selectAllMembers(MemberTable mt) {
		return mt.selectAllMembers();
	}
}
