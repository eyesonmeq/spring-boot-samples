/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.web.process;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月29日 下午4:24:06
 * @author li_ming 
 */
@Controller
@RequestMapping("/admin/process/deploy/")
public class ProcessDeployController {
	/**
	 * 跳转列表页面
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list() {
		return "admin/process/process-deploy-list.jsp";
	}
}
