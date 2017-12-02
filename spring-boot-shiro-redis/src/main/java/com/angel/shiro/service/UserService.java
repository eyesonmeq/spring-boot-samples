/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.shiro.service;

import java.util.List;
import java.util.Set;

import com.angel.shiro.domain.UserInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 上午11:01:23
 * @author li_ming 
 */
public interface UserService {
	/**
	 * 根据账号Account查询当前用户
	 * @param account
	 * @return
	 */
	UserInfo findByAccount(String account);

	/**	
	 * 获取资源集合
	 * @param account
	 * @return
	 */
	Set<String> findPermissions(String account);

	/**
	 * 获取URL权限
	 * @param account
	 * @return
	 */
	List<String> findPermissionUrl(String account);
}
