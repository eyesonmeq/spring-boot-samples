/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package sample.logback;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ADD FUNCTION
 *
 * @date: 2017年5月26日 下午1:45:49
 * @author Tony 
 */
@SpringBootApplication
public class SampleLogbackApplication {
	private static final Logger logger = LoggerFactory.getLogger(SampleLogbackApplication.class);

	@PostConstruct
	public void logSomething() {
		logger.debug("Sample Debug Message");
		logger.trace("Sample Trace Message");
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleLogbackApplication.class, args).close();
	}
}
