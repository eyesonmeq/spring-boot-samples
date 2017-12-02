/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.websocket.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 下午12:15:37
 * @author li_ming 
 */
@Controller
public class IndexController {
	@Autowired
	private SimpMessagingTemplate messagingTemplate;

	/**
	 * Index
	 * 
	 * @return
	 */
	@RequestMapping(value = { "", "/", "index" })
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("chat")
	public String chat() {
		return "chat.jsp";
	}

	/**
	 * 发送消息
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/sendMessage", method = RequestMethod.POST)
	public ResponseEntity<?> sendMessage() {
		messagingTemplate.convertAndSend("/queue/notify", "test");
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
