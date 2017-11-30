/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.freemaker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 下午4:20:26
 * @author li_ming 
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lance.freemaker.mapper")
public class SimpleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}
}
