/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月1日 下午2:22:31
 * @author li_ming 
 */
@SpringBootApplication
public class SimpleApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SimpleApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}
}
