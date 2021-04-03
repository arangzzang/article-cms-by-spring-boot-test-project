package com.mytest.project.member.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytest.project.mapper.MemberTable;
import com.mytest.project.member.service.MemberDao;
import com.mytest.project.member.vo.Member;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired 
	private MemberDao dao;
	@Autowired
	private MemberTable mt;
	
	@Override
	public List<Member> selectAllMembers() {
		return dao.selectAllMembers(mt);
	}
}
