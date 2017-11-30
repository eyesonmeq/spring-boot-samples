/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.freemaker.web.site;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.angel.freemaker.domain.NewsInfo;
import com.angel.freemaker.domain.PageInfo;
import com.angel.freemaker.service.NewService;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 下午6:14:19
 * @author li_ming 
 */
@Controller
public class IndexController {
	@Autowired
	private NewService newService;

	/**
	 * Index
	 * @param model
	 * @param request
	 */
	@RequestMapping(value = { "", "/", "index" })
	public String index(Model model, HttpServletRequest request) {
		String page = request.getParameter("page");
		page = StringUtils.defaultIfBlank(page, "1");
		int pageNumber = Integer.valueOf(page);

		int total = newService.findCount();
		PageInfo<NewsInfo> pageInfo = new PageInfo<>(total, pageNumber);
		pageInfo.setList(newService.findAll(pageInfo.getPageStart()));

		model.addAttribute("page", pageInfo);
		return "index";
	}

	/**
	 * Detail
	 * @param model
	 * @param id
	 */
	@RequestMapping("detail/{id}")
	public String detail(Model model, @PathVariable int id) {
		model.addAttribute("info", newService.findOne(id));
		return "detail";
	}
}
