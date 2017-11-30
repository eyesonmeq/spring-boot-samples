/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 上午11:52:03
 * @author li_ming 
 */
@EnableCaching
@EnableScheduling
@SpringBootApplication
public class SimpleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}
}
