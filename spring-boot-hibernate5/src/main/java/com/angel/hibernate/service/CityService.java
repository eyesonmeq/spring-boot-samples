/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.hibernate.service;

import java.util.List;

import com.angel.hibernate.entity.CityEntity;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月1日 下午2:33:52
 * @author li_ming 
 */
public interface CityService {
	/**
	 * findAll
	 * @return
	 */
	List<CityEntity> findAll();

	/**
	 * Save
	 * @param city
	 */
	void save(CityEntity city);

	void delete(long id);

	void delete(CityEntity city);
}
