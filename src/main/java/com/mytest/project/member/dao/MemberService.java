package com.mytest.project.member.dao;

import java.util.List;

import com.mytest.project.member.vo.Member;

public interface MemberService {

	List<Member> selectAllMembers();
}
