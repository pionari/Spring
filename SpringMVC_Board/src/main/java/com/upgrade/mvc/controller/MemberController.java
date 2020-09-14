package com.upgrade.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.upgrade.mvc.biz.MemberBiz;
import com.upgrade.mvc.dto.MemberDto;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberBiz memberBiz;

	private Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping("/loginform.do")
	public String loginForm() {
		return "login";
	}
	
	/*
	 * @loginponseBody : java 객체를 loginponse객체의 데이터로 
	 * @RequestBody : request 객체에 담겨져서 넘어오는 데이터 -> java 객체 binding
	 */
	@RequestMapping(value = "/ajaxlogin.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Boolean> ajaxLogin(@RequestBody MemberDto dto, HttpSession session) {
		
		logger.info("로그인 컨트롤러 진입");
		MemberDto login = memberBiz.login(dto);
		
		boolean check = false;
		
		if(login != null) {
			session.setAttribute("login", login);
			check = true;
		}
		
		Map<String,Boolean> map = new HashMap<String, Boolean>();
		map.put("check", check);
		
		return map;
	}

}
