/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.mq.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月28日 下午12:03:42
 * @author li_ming 
 */
@SpringBootApplication
@EnableJms
public class SimpleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}
}
