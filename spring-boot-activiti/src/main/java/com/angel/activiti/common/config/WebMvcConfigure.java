/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.common.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.angel.activiti.common.sitemesh.WebSiteMeshFilter;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月28日 下午5:05:49
 * @author li_ming 
 */
@Configuration
public class WebMvcConfigure extends WebMvcConfigurerAdapter {
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("forward:/index.jsp");
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
		super.addViewControllers(registry);
	}

	/**
	 * 装饰器
	 * @return
	 */
	@Bean
	public FilterRegistrationBean siteMeshFilter() {
		FilterRegistrationBean fitler = new FilterRegistrationBean();
		WebSiteMeshFilter siteMeshFilter = new WebSiteMeshFilter();
		fitler.setFilter(siteMeshFilter);
		return fitler;
	}
}
