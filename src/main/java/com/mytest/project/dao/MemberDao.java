package com.mytest.project.dao;

import java.util.List;

import com.mytest.project.mapper.MemberTable;
import com.mytest.project.vo.Member;

public interface MemberDao {

	List<Member>selectAllMembers(MemberTable mt);
}
