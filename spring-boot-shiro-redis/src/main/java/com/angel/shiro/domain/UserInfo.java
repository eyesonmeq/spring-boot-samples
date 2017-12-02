/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.shiro.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 上午10:57:45
 * @author li_ming 
 */
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 730863452165463427L;

	private int id;
	private String account;
	private String password;
	private String name;
	private Date createTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
