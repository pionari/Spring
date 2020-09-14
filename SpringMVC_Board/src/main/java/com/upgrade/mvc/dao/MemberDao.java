package com.upgrade.mvc.dao;

import com.upgrade.mvc.dto.MemberDto;

public interface MemberDao {
	
String NAMESPACE ="mymember.";
	
	public MemberDto login(MemberDto dto);

}
