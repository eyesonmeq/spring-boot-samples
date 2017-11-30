/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.freemaker.service;

import java.util.List;

import com.angel.freemaker.domain.NewsInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 下午4:44:02
 * @author li_ming 
 */
public interface NewService {

	/**
	 * findAll
	 * @param pageNo
	 */
	List<NewsInfo> findAll(int pageNo);

	/**
	 * findCount
	 */
	int findCount();

	/**
	 * 查询一条记录
	 * @param id
	 * @return
	 */
	NewsInfo findOne(int id);

	/**
	 * save
	 * @param info
	 */
	void save(NewsInfo info);
}
