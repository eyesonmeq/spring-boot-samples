/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.hibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angel.hibernate.entity.CityEntity;
import com.angel.hibernate.repository.CityRepository;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月1日 下午2:34:27
 * @author li_ming 
 */
@Service
public class CityServiceImpl implements CityService {
	@Autowired
	private CityRepository cityRepository;

	/**
	 * findAll
	 * @return
	 */
	public List<CityEntity> findAll() {
		return cityRepository.findAll();
	}

	/**
	 * Save
	 * @param city
	 */
	@Transactional
	public void save(CityEntity city) {
		cityRepository.save(city);
	}

	@Override
	public void delete(long id) {
		cityRepository.delete(id);
	}

	@Override
	public void delete(CityEntity city) {
		cityRepository.delete(city);
	}
}
