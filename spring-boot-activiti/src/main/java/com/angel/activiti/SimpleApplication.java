/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月28日 下午4:27:46
 * @author li_ming 
 */
@SpringBootApplication
@MapperScan("com.lance.activiti.mapper")
@PropertySource(value = "classpath:common.properties")
public class SimpleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}
}
