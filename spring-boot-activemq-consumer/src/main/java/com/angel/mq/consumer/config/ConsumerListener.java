/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.mq.consumer.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月28日 上午11:34:02
 * @author li_ming 
 */
@Component("consumerListener")
public class ConsumerListener {
	Logger log = LogManager.getLogger(getClass());

	public void handleMessage(String message) {
		log.info("TextMessage: {}", message);
	}
}
