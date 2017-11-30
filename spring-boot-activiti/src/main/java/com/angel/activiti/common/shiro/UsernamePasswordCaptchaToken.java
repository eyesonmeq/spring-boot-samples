/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.common.shiro;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * 后台用户登录
 *
 * @date: 2017年11月28日 下午6:18:09
 * @author li_ming 
 */
public class UsernamePasswordCaptchaToken extends UsernamePasswordToken {
	private static final long serialVersionUID = -2516621696792507680L;

	/**验证码*/
	private String captcha;

	public UsernamePasswordCaptchaToken() {
		super();
	}

	public UsernamePasswordCaptchaToken(String username, char[] password, boolean rememberMe, String host,
			String captcha) {
		super(username, password, rememberMe, host);
		this.captcha = captcha;
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
}
