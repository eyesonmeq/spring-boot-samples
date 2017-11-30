/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.web.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 角色管理
 *
 * @date: 2017年11月29日 下午4:26:14
 * @author li_ming 
 */
@Controller
@RequestMapping("admin/system/role")
public class RoleController {
	/**
	 * 角色首页
	 * @return
	 */
	@RequestMapping(value = { "", "/", "index" }, method = RequestMethod.GET)
	public String index() {
		return "admin/system/index.jsp";
	}
}
