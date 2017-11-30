/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.model.process;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * 定义流程
 *
 * @date: 2017年11月28日 下午6:25:48
 * @author li_ming 
 */
@Data
public class ProcessDefineInfo implements Serializable {
	private static final long serialVersionUID = -6159834621213504983L;
	// 发布成功
	public static final int DEPLOY = 2;
	// 未发布
	public static final int UNDEPLOY = 1;

	// ID 
	private int id;
	// 流程名称
	private String processName;
	// 流程Key
	private String processKey;
	// 流程File, leave.bpmn20.xml
	private String processFile;
	// 流程状态
	private int processStatus;
	// 发布流程ID
	private String deploymentId;
	// 创建时间
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the processName
	 */
	public String getProcessName() {
		return processName;
	}

	/**
	 * @param processName the processName to set
	 */
	public void setProcessName(String processName) {
		this.processName = processName;
	}

	/**
	 * @return the processKey
	 */
	public String getProcessKey() {
		return processKey;
	}

	/**
	 * @param processKey the processKey to set
	 */
	public void setProcessKey(String processKey) {
		this.processKey = processKey;
	}

	/**
	 * @return the processFile
	 */
	public String getProcessFile() {
		return processFile;
	}

	/**
	 * @param processFile the processFile to set
	 */
	public void setProcessFile(String processFile) {
		this.processFile = processFile;
	}

	/**
	 * @return the processStatus
	 */
	public int getProcessStatus() {
		return processStatus;
	}

	/**
	 * @param processStatus the processStatus to set
	 */
	public void setProcessStatus(int processStatus) {
		this.processStatus = processStatus;
	}

	/**
	 * @return the deploymentId
	 */
	public String getDeploymentId() {
		return deploymentId;
	}

	/**
	 * @param deploymentId the deploymentId to set
	 */
	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
