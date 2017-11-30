/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.mapper.process;

import java.util.List;
import java.util.Map;

import com.angel.activiti.model.process.ProcessDefineInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月28日 下午6:29:01
 * @author li_ming 
 */
public interface ProcessDefineMapper {
	/**
	 * 查询所有流程
	 * @return
	 */
	List<ProcessDefineInfo> findAll(Map<String, Object> params);

	/**
	* 保存对象
	* @author Lance
	* @since 2016-08-26 16:31:12
	*/
	int save(ProcessDefineInfo info);

	/**
	* 修改对象
	* @author Lance
	* @since 2016-08-26 16:31:12
	*/
	int update(ProcessDefineInfo info);

	/**
	* 删除对象
	* @author Lance
	* @since 2016-08-26 16:31:12
	*/
	int delete(int id);

	/**
	* 根据ID查询对象
	* @author Lance
	* @since 2016-08-26 16:31:12
	*/
	ProcessDefineInfo findOne(int id);
}
