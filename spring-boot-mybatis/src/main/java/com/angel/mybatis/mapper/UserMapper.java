/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.angel.mybatis.domain.UserInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月1日 下午4:45:56
 * @author li_ming 
 */
@Mapper
public interface UserMapper {
	/**
	 * findOne
	 * @param id
	 * @return
	 */
	@Select(value = "select *from boot_user where id=#{id}")
	UserInfo findOne(int id);

	/**
	 * findAll
	 * @return
	 */
	List<UserInfo> findAll();
}
