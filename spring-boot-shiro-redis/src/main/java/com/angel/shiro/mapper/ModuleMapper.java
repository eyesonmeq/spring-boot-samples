/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.shiro.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.angel.shiro.domain.ModuleInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 上午10:58:30
 * @author li_ming 
 */
public interface ModuleMapper {
	/**
	 * 获取该人的权限模块
	 * @param userId
	 * @return
	 */
	@Select(value = "select e.*from t_user_role b left join t_role c on b.role_id=c.id left join t_role_module d on c.id=d.role_id left join t_module e on d.module_id=e.id where b.user_id=#{userId}")
	List<ModuleInfo> findModuleByUserId(int userId);
}