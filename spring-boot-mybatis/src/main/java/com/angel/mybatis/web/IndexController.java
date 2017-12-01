/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.mybatis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.angel.mybatis.service.UserService;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月1日 下午4:49:52
 * @author li_ming 
 */
@Controller
public class IndexController {
	@Autowired
	private UserService userService;

	/**
	 * 查询用户
	 * @return
	 */
	@ResponseBody
	@RequestMapping("finduser")
	public String findUser() {
		return JSON.toJSONString(userService.findAll());
	}

	/**
	 * findById
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("user/{id}")
	public String findById(@PathVariable int id) {
		return JSON.toJSONString(userService.findOne(id));
	}
}
