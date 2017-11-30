/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.freemaker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.angel.freemaker.domain.NewsInfo;
import com.angel.freemaker.mapper.NewsMapper;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 下午4:44:29
 * @author li_ming 
 */
@Service
public class NewServiceImpl implements NewService {
	@Autowired
	private NewsMapper newsMapper;

	@Override
	public List<NewsInfo> findAll(int pageNo) {
		return newsMapper.findAll(pageNo);
	}

	@Override
	public NewsInfo findOne(int id) {
		return newsMapper.findOne(id);
	}

	@Transactional
	@Override
	public void save(NewsInfo info) {
		newsMapper.save(info);
	}

	@Override
	public int findCount() {
		return newsMapper.findCount();
	}
}
