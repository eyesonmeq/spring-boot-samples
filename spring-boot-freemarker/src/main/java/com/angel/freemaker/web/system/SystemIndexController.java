/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.freemaker.web.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 下午6:15:23
 * @author li_ming 
 */
@Controller
public class SystemIndexController {
	@RequestMapping("system/admin/index")
	public String index() {
		return "system/index.jsp";
	}
}
