/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.freemaker.service;

import com.angel.freemaker.domain.UserInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 下午4:47:12
 * @author li_ming 
 */
public interface UserService {
	/**
	 * 根据账号Account查询当前用户
	 * @param account
	 * @return
	 */
	UserInfo findByAccount(String account);
}
