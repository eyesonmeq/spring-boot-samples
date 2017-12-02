/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.shiro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angel.shiro.domain.ModuleInfo;
import com.angel.shiro.mapper.ModuleMapper;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 上午11:00:37
 * @author li_ming 
 */
@Service
public class ModuleServiceImpl implements ModuleService {
	@Autowired
	private ModuleMapper moduleMapper;

	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	public List<ModuleInfo> findModuleByUserId(int userId) {
		return moduleMapper.findModuleByUserId(userId);
	}
}
