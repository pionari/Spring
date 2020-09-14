package com.upgrade.mvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	private Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		logger.info("LoginInterceptor.preHandle");

		// controller로 이동 허용
		if (request.getRequestURI().contains("/loginform.do")) {
			return true;
		}
		if (request.getRequestURI().contains("/ajaxlogin.do")) {
			return true;
		}

		// 로그인 되어있을 때
		if (request.getSession().getAttribute("login") != null) {
			return true;
		}

		// 로그인 안되어있을 때 로그인 폼으로 보내기
		if (request.getSession().getAttribute("login") == null) {
			response.sendRedirect("loginform.do");
			return true;
		}
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
