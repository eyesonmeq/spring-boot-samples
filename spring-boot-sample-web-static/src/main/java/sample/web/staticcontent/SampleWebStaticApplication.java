/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package sample.web.staticcontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * ADD FUNCTION
 *
 * @date: 2017年5月26日 下午4:49:58
 * @author Tony 
 */
@SpringBootApplication
public class SampleWebStaticApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SampleWebStaticApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleWebStaticApplication.class, args);
	}
}
