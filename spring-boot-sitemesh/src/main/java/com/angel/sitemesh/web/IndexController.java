/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.sitemesh.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 上午11:49:38
 * @author li_ming 
 */
@Controller
@RequestMapping("/admin/")
public class IndexController {
	@RequestMapping("index")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("tab")
	public String tab() {
		return "tab.jsp";
	}

	@RequestMapping("nestedlayout")
	public String nestedlayout() {
		return "nestedlayout.jsp";
	}

	@RequestMapping("datagrid")
	public String datagrid() {
		return "datagrid.jsp";
	}
}
