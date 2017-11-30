/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 下午2:20:56
 * @author li_ming 
 */
@Controller
public class DemoController {
	@ResponseBody
	@RequestMapping("demo")
	public void demo() {
		System.out.println("demo");
		System.out.println("xxxxxxx");
		System.out.println("-----------");
		System.out.println("-------point 1-----------");
		System.out.println("-------point 2-----------");
		System.out.println("-------point 3-----------");
		System.out.println("demo end.");
	}
}
