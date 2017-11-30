/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.cache.redis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 下午1:50:19
 * @author li_ming 
 */
@Component
@CacheConfig(cacheNames = "CityService")
public class CityService {
	Logger logger = LogManager.getLogger(getClass());

	@Cacheable
	public CityInfo getCity(int id, String city) {
		logger.info("id: {}, city: {}", id, city);
		return new CityInfo(id, city);
	}
}
