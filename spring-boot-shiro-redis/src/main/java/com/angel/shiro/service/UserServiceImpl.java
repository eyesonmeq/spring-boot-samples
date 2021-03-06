/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.shiro.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angel.shiro.domain.ModuleInfo;
import com.angel.shiro.domain.UserInfo;
import com.angel.shiro.mapper.UserMapper;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 上午11:01:56
 * @author li_ming 
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ModuleService moduleService;

	/**
	 * 根据账号Account查询当前用户
	 * @param account
	 * @return
	 */
	public UserInfo findByAccount(String account) {
		return userMapper.findByAccount(account);
	}

	/**
	 * 获取资源集合
	 * @param account
	 * @return
	 */
	public Set<String> findPermissions(String account) {
		Set<String> set = Sets.newHashSet();
		UserInfo user = findByAccount(account);
		List<ModuleInfo> modules = moduleService.findModuleByUserId(user.getId());

		for (ModuleInfo info : modules) {
			set.add(info.getModuleKey());
		}
		return set;
	}

	/**
	 * 获取URL权限
	 * @param account
	 * @return
	 */
	public List<String> findPermissionUrl(String account) {
		List<String> list = Lists.newArrayList();
		UserInfo user = findByAccount(account);
		List<ModuleInfo> modules = moduleService.findModuleByUserId(user.getId());

		for (ModuleInfo info : modules) {
			if (info.getModuleType() == ModuleInfo.URL_TYPE) {
				list.add(info.getModulePath());
			}
		}
		return list;
	}
}
