/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.websocket.client.web;

import java.io.Serializable;
import java.util.UUID;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 下午1:34:27
 * @author li_ming 
 */
public class MessageInfo implements Serializable {
	private static final long serialVersionUID = 6367726218945501780L;

	private String id;

	private String name;

	public MessageInfo(String name) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
