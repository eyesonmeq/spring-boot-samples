/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.quartz.common.job;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月1日 下午5:07:30
 * @author li_ming 
 */
public class Minute3Job implements Job {
	Logger logger = LogManager.getLogger(getClass());

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("JobName3: {}", context.getJobDetail().getKey().getName());
	}

}
