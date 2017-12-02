/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.websocket.service;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 下午12:14:45
 * @author li_ming 
 */
public class EchoServiceImpl implements EchoService {
	private final String echoFormat;

	public EchoServiceImpl(String echoFormat) {
		this.echoFormat = (echoFormat != null) ? echoFormat : "%s";
	}

	@Override
	public String getMessage(String message) {
		return String.format(this.echoFormat, message);
	}
}
