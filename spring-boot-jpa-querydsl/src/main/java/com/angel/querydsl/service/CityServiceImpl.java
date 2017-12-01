/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.querydsl.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.angel.querydsl.entity.CityEntity;
import com.angel.querydsl.entity.QCityEntity;
import com.angel.querydsl.repository.CityRepository;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月1日 下午3:21:34
 * @author li_ming 
 */
@Service
public class CityServiceImpl implements CityService {
	@PersistenceContext
	private EntityManager em;
	@Autowired
	private CityRepository cityRepository;

	/**
	 * findAll
	 * @return
	 */
	public List<CityEntity> findAll(String hotelName) {
		QCityEntity cityEntity = QCityEntity.cityEntity;
		JPAQuery<CityEntity> query = new JPAQuery<>(em);
		BooleanExpression express = cityEntity.state.eq("1");

		if (StringUtils.hasText(hotelName)) {
			express = express.and(cityEntity.hotels.any().name.likeIgnoreCase('%' + hotelName + '%'));
		}
		return query.select(cityEntity).from(cityEntity).where(express).fetch();
	}

	/**
	 * Save
	 * @param city
	 */
	@Transactional
	public void save(CityEntity city) {
		cityRepository.save(city);
	}

	@Transactional
	public void delete(long id) {
		cityRepository.delete(id);
	}

	@Transactional
	public void delete(CityEntity city) {
		cityRepository.delete(city);
	}
}
