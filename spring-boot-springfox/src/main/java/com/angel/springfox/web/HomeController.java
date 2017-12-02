/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.springfox.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.angel.springfox.domain.TreeInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 下午12:01:35
 * @author li_ming 
 */
@Controller
@RequestMapping("api/v1.0/home/")
public class HomeController {
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list() {
		return "list";
	}

	/**
	 * 根据ID删除数据
	 * @param id 根据ID删除数据
	 * @return
	 */
	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		return "delete";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(TreeInfo info) {
		return "save";
	}
}
