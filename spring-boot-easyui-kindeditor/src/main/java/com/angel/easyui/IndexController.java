/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.easyui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 下午2:44:23
 * @author li_ming 
 */
@Controller
public class IndexController {
	@RequestMapping(value = { "", "/", "index" })
	public String index() {
		return "index.jsp";
	}
}
