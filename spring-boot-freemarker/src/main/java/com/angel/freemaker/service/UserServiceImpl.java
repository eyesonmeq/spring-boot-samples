/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.freemaker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angel.freemaker.domain.UserInfo;
import com.angel.freemaker.mapper.UserMapper;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 下午4:47:43
 * @author li_ming 
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	/**
	 * 根据账号Account查询当前用户
	 * @param account
	 * @return
	 */
	public UserInfo findByAccount(String account) {
		return userMapper.findByAccount(account);
	}
}
