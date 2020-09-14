package com.upgrade.mvc.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upgrade.mvc.dao.MemberDao;
import com.upgrade.mvc.dto.MemberDto;

@Service
public class MemberBizImpl implements MemberBiz {
	
	@Autowired
	private MemberDao dao;

	@Override
	public MemberDto login(MemberDto dto) {
		return dao.login(dto);
	}

}
