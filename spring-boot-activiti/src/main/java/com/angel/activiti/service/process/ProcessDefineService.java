/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.service.process;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import com.angel.activiti.model.process.ProcessDefineInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月28日 下午6:40:38
 * @author li_ming 
 */
public interface ProcessDefineService {
	/**
	 * 查询所有定义的流程
	 * @return
	 */
	List<ProcessDefineInfo> findAll(Map<String, Object> params);

	/**
	 * 保存方法
	 * @param info
	 */
	void save(ProcessDefineInfo info);

	/**
	 * 更新方法
	 * @param info
	 */
	void update(ProcessDefineInfo info);

	/**
	 * 删除流程定义
	 * @param id
	 */
	void delete(int id);

	/**
	 * 流程发布
	 * @param id
	 */
	void deploy(int id);

	/**
	 * 关闭发布流程
	 * @param id
	 */
	void closeDeploy(int id);

	/**
	 * 根据流程发布id获取流程图
	 * @param deploymentId
	 * @return
	 */
	InputStream getProcessDefineIS(String deploymentId);
}
