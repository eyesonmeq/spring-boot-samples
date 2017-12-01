/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.querydsl.service;

import java.util.List;

import com.angel.querydsl.entity.CityEntity;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月1日 下午3:20:08
 * @author li_ming 
 */
public interface CityService {
	/**
	 * findAll
	 * @return
	 */
	List<CityEntity> findAll(String hotelName);

	/**
	 * Save
	 * @param city
	 */
	void save(CityEntity city);

	void delete(long id);

	void delete(CityEntity city);
}
