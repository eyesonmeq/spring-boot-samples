/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.net.server;

import java.net.InetSocketAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.angel.net.server.common.ChatServer;

import io.netty.channel.ChannelFuture;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 下午1:39:24
 * @author li_ming 
 */
@SpringBootApplication
public class NettyWebSocketServerApplication implements CommandLineRunner {
	@Autowired
	private ChatServer chatServer;

	public static void main(String[] args) {
		SpringApplication.run(NettyWebSocketServerApplication.class, args);
	}

	@Bean
	public ChatServer chatServer() {
		return new ChatServer();
	}

	@Override
	public void run(String... args) throws Exception {
		InetSocketAddress address = new InetSocketAddress("127.0.0.1", 9090);
		ChannelFuture future = chatServer.start(address);

		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				chatServer.destroy();
			}
		});

		future.channel().closeFuture().syncUninterruptibly();
	}
}
