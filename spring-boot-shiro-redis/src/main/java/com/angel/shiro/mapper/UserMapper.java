/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.shiro.mapper;

import org.apache.ibatis.annotations.Select;

import com.angel.shiro.domain.UserInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 上午10:59:12
 * @author li_ming 
 */
public interface UserMapper {
	@Select("select *from t_user where account=#{account}")
	UserInfo findByAccount(String account);
}
