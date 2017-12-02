/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.shiro;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 上午10:47:49
 * @author li_ming 
 */
@SpringBootApplication
@MapperScan("com.lance.shiro.mapper")
public class SimpleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}
}
