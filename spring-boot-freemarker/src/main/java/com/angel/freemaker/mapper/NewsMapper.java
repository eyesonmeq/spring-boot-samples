/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.freemaker.mapper;

import java.util.List;

import com.angel.freemaker.domain.NewsInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 下午4:42:44
 * @author li_ming 
 */
public interface NewsMapper {
	/**
	 * findAll
	 * @param pageNo
	 */
	List<NewsInfo> findAll(int pageNo);

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

	/**
	 * findCount
	 */
	int findCount();
}
