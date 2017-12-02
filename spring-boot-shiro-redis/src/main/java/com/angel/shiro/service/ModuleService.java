/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.shiro.service;

import java.util.List;

import com.angel.shiro.domain.ModuleInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 上午11:00:00
 * @author li_ming 
 */
public interface ModuleService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	List<ModuleInfo> findModuleByUserId(int userId);
}
