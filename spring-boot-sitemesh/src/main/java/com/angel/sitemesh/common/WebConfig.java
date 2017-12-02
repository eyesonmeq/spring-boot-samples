/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.sitemesh.common;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 上午11:38:51
 * @author li_ming 
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
	@Bean
	public FilterRegistrationBean siteMeshFilter() {
		FilterRegistrationBean fitler = new FilterRegistrationBean();
		WebSiteMeshFilter siteMeshFilter = new WebSiteMeshFilter();
		fitler.setFilter(siteMeshFilter);
		return fitler;
	}
}
