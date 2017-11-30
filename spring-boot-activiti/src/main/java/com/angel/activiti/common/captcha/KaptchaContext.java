/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.common.captcha;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月28日 下午4:35:45
 * @author li_ming 
 */
public class KaptchaContext {
	public void generate(Integer type, HttpServletRequest req, HttpServletResponse res, String key) {
		AbstractBaseKaptcha kaptcha = KaptchaFactory.getInstance().creator(type);
		try {
			kaptcha.captcha(req, res, key);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
