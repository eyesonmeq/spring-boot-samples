/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.mapper.system;

import java.util.List;

import com.angel.activiti.model.system.RoleInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月28日 下午6:30:19
 * @author li_ming 
 */
public interface RoleMapper {
	/**
	 * 查询所有角色
	 * @return
	 */
	List<RoleInfo> findAll();

	/**
	 * 根据ID查询角色
	 * @param id
	 * @return
	 */
	RoleInfo findOne(int id);

	/**
	 * 保存角色
	 * @param user
	 */
	void save(RoleInfo user);

	/**
	 * 更新角色
	 * @param user
	 */
	int update(RoleInfo user);

	/**
	 * 删除角色
	 * @param id
	 */
	int delete(int id);
}
