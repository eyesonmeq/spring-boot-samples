/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 下午12:10:07
 * @author li_ming 
 */
@SpringBootApplication
@EnableWebSocket
public class SimpleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}
}
