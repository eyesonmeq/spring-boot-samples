/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.mq.consumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月28日 上午11:28:35
 * @author li_ming 
 */
@SpringBootApplication
@EnableJms
public class SimpleApplication {
	static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		ConfigurableApplicationContext content = SpringApplication.run(SimpleApplication.class, args);

		//Test Bean
		String[] beanNames = content.getBeanDefinitionNames();
		for (String name : beanNames) {
			logger.info("beanName: {}", name);
		}
	}
}
