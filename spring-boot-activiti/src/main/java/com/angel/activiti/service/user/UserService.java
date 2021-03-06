/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.service.user;

import java.util.List;

import com.angel.activiti.model.system.UserInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月29日 下午4:19:36
 * @author li_ming 
 */
public interface UserService {
	/**
	 * 查询所有用户信息
	 * @return
	 */
	List<UserInfo> findAll();

	/**
	 * 根据登录账号查询用户信息
	 * @param account
	 * @return
	 */
	UserInfo findByAccount(String account);

	/**
	 * 根据ID查询用户信息
	 * @param id
	 * @return
	 */
	UserInfo findOne(int id);

	/**
	 * 保存用户信息
	 * @param user
	 */
	void save(UserInfo user);

	/**
	 * 更新用户对象
	 * @param user
	 */
	int update(UserInfo user);

	/**
	 * 删除对象
	 * @param id
	 */
	int delete(int id);
}
