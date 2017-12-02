/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.shiro.config;

import org.apache.shiro.cache.AbstractCacheManager;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 上午10:54:41
 * @author li_ming 
 */
public class ShrioRedisCacheManager extends AbstractCacheManager {
	private RedisTemplate<byte[], Object> redisTemplate;

	public ShrioRedisCacheManager(RedisTemplate<byte[], Object> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	@Override
	protected Cache<byte[], Object> createCache(String name) throws CacheException {
		return new ShrioRedisCache<byte[], Object>(redisTemplate, name);
	}
}
