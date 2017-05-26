/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package sample.actuator;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ADD FUNCTION
 *
 * @date: 2017年5月26日 下午2:31:53
 * @author Tony 
 */
@ConfigurationProperties(prefix = "service", ignoreUnknownFields = false)
public class ServiceProperties {
	/**
	 * Name of the service.
	 */
	private String name = "World";

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
