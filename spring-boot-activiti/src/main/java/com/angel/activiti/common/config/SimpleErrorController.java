/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.common.config;

import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 统一处理错误页面, 或者在Web.xml里面配置
 *
 * @date: 2017年11月28日 下午4:42:19
 * @author li_ming 
 */
@ControllerAdvice
public class SimpleErrorController {
	public String error404() {
		return "error/404.jsp";
	}

	/**
	 * 为授权页面
	 * @author lance
	 * @since 2016年11月6日上午11:03:41
	 */
	@ExceptionHandler(UnauthorizedException.class)
	public String errorUnauthorized(UnauthorizedException ex) {
		return "redirect:/error/unauthorized.html";
	}

	/**
	 * 其他处理404页面
	 * @author lance
	 * @since 2016年11月6日上午11:03:50
	 */
	@ExceptionHandler(value = { NullPointerException.class })
	public String error404(NullPointerException ex) {
		return "redirect:/error/404.html";
	}
}
