/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.querydsl.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月1日 下午2:48:55
 * @author li_ming 
 */
@Configuration
@EnableTransactionManagement
public class WebMVCConfig {
	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		//return new org.springframework.transaction.PlatformTransactionManager(entityManagerFactory);
		return null;
	}
}
