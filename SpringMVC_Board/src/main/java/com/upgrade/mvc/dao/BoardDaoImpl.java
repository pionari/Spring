package com.upgrade.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.upgrade.mvc.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSessionTemplate sqlsession;

	@Override
	public List<BoardDto> selectList() {
		List<BoardDto> list = sqlsession.selectList(NAMESPACE+"selectList");
		return list;
	}

	@Override
	public BoardDto selectOne(int myno) {
		BoardDto dto = new BoardDto();
		dto = sqlsession.selectOne(NAMESPACE+"selectOne", myno);
		return dto;
	}

	@Override
	public int insert(BoardDto dto) {
		int res = sqlsession.insert(NAMESPACE+"insert", dto);
		return res;
	}

	@Override
	public int update(BoardDto dto) {
		int res = sqlsession.update(NAMESPACE+"update", dto);
		return res;
	}

	@Override
	public int delete(int myno) {
		int res = sqlsession.delete(NAMESPACE+"delete", myno);
		return res;
	}

}
