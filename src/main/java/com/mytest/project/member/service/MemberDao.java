package com.mytest.project.member.service;

import java.util.List;

import com.mytest.project.mapper.MemberTable;
import com.mytest.project.member.vo.Member;

public interface MemberDao {

	List<Member>selectAllMembers(MemberTable mt);
}
