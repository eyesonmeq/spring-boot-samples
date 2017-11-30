/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 下午3:31:15
 * @author li_ming 
 */
@SpringBootApplication
public class SimpleApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SimpleApplication.class, args);

		String[] beanNames = context.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			System.out.println("BeanName: " + beanName);
		}
	}
}
