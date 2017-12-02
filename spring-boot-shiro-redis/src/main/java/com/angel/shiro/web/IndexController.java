/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.shiro.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 上午11:05:53
 * @author li_ming 
 */
@Controller
public class IndexController {
	/**
	 * Go Index
	 * @return
	 */
	@RequestMapping(value = { "", "/", "index" })
	public String index() {
		return "index.jsp";
	}

	/**
	 * unauthor
	 * @return
	 */
	@RequestMapping("unauthor")
	public String unauthor() {
		return "unauthor.jsp";
	}

	/**
	 * reports
	 * @return
	 */
	@RequestMapping("reports")
	public String reports() {
		return "reports.jsp";
	}
}
