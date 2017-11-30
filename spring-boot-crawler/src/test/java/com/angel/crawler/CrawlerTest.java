/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.crawler;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月30日 下午2:17:25
 * @author li_ming 
 */
public class CrawlerTest {
	Logger logger = LogManager.getLogger(getClass());

	@Test
	public void run() throws InterruptedException, ExecutionException {
		String[] urls = { "https://www.baidu.com/" };
		List<Future<String>> results = Crawler.getInstance().initUrl(urls).parallelDrainQueue(3);
		for (Future<String> future : results) {
			logger.info("result: {}", future.get());
		}
	}
}
