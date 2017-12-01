/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angel.mybatis.domain.UserInfo;
import com.angel.mybatis.mapper.UserMapper;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月1日 下午4:47:21
 * @author li_ming 
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<UserInfo> findAll() {
		return userMapper.findAll();
	}

	@Override
	public UserInfo findOne(int id) {
		return userMapper.findOne(id);
	}
}
