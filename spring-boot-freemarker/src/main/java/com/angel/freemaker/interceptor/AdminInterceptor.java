/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.freemaker.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.angel.freemaker.domain.UserInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 下午4:39:16
 * @author li_ming 
 */
public class AdminInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Object obj = request.getSession().getAttribute("sys_user_key");
		String xrequest = request.getHeader("x-requested-with");

		if (obj == null || !(obj instanceof UserInfo)) {
			if ("XMLHttpRequest".equalsIgnoreCase(xrequest)) {//拦截AJAX请求
				response.setHeader("sessionstatus", "timeout");
			} else {
				response.sendRedirect(request.getContextPath() + "/system/login");
			}

			return false;
		}
		return true;
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
