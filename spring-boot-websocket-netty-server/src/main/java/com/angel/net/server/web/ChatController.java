/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.net.server.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.angel.net.server.common.ChatConstants;
import com.angel.net.server.module.UserInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 下午1:50:34
 * @author li_ming 
 */
@Controller
@RequestMapping("/chat")
public class ChatController {
	// 跳转到交谈聊天页面
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String talk(String token, Model model) {
		model.addAttribute("token", token);
		return "chat.jsp";
	}

	@ResponseBody
	@RequestMapping(value = "users", method = RequestMethod.GET, produces = { "application/json; charset=UTF-8",
			"text/plain" })
	public String users(String token) {
		Map<String, UserInfo> onlines = ChatConstants.onlines;
		UserInfo cur = onlines.get(token);

		Map<String, Object> map = new HashMap<>(2);
		map.put("curName", cur != null ? cur.getCode() : "");
		map.put("users", onlines);
		return JSON.toJSONString(map);
	}
}
