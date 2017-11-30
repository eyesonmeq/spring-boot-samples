/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.freemaker.mapper;

import org.apache.ibatis.annotations.Select;

import com.angel.freemaker.domain.UserInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 下午4:43:14
 * @author li_ming 
 */
public interface UserMapper {
	@Select("select *from t_user where account=#{account}")
	UserInfo findByAccount(String account);
}
