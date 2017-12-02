/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.websocket.client.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 下午1:35:00
 * @author li_ming 
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/ws_notice").withSockJS();
	}
}
