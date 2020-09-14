package com.upgrade.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.upgrade.mvc.biz.BoardBiz;
import com.upgrade.mvc.dto.BoardDto;

@Controller
public class BoardController {
	
	@Autowired
	private BoardBiz biz;
	
	@RequestMapping(value="/list.do")
	public String selectList(Model model) {
		List<BoardDto> list = biz.selectList();
		model.addAttribute("list",list);
		return "list";
	}
	
	@RequestMapping(value="/detail.do")
	public String selectOne(Model model, int myno) {
		BoardDto dto = biz.selectOne(myno);
		model.addAttribute("dto", dto);
		return "detail";
	}
	
	@RequestMapping(value="/insert.do")
	public String insert(Model model) {
		return "insert";
	}
	
	@RequestMapping(value="/insertRes.do",  method = RequestMethod.POST)
	public String insertRes(Model model,BoardDto dto) {
		int res = biz.insert(dto);
		if(res>0) {
			return "redirect:list.do";
		}
		return "insert.do";
	}
	
	@RequestMapping(value="/update.do")
	public String update(Model model,int myno) {
		BoardDto dto = biz.selectOne(myno);
		model.addAttribute("dto", dto);
		return "update";
	}
	
	@RequestMapping(value="/updateRes.do", method = RequestMethod.POST)
	public String updateRes(Model model,BoardDto dto) {
		int res = biz.update(dto);
		if (res > 0) {
			return "redirect:detail.do?myno=" + dto.getMyno();
		}
		return "redirect:update.do?myno=" + dto.getMyno();
	}
	
	@RequestMapping(value="/delete.do")
	public String delete(Model model, int myno) {
		int res = biz.delete(myno);
		if (res > 0) {
			return "redirect:list.do";
		}
		return "redirect:detail.do?myno=" + myno;
	}
}
