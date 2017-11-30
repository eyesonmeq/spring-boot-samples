/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.freemaker.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.angel.freemaker.interceptor.AdminInterceptor;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 下午4:38:23
 * @author li_ming 
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new AdminInterceptor()).addPathPatterns("/system/admin/**");
	}
}
