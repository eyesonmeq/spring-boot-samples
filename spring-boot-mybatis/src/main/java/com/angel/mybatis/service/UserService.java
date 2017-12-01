/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.mybatis.service;

import java.util.List;

import com.angel.mybatis.domain.UserInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月1日 下午4:46:49
 * @author li_ming 
 */
public interface UserService {
	/**
	 * findAll
	 * @return
	 */
	List<UserInfo> findAll();

	UserInfo findOne(int id);
}
