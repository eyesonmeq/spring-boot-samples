/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package sample.actuator;

import org.springframework.stereotype.Component;

/**
 * ADD FUNCTION
 *
 * @date: 2017年5月26日 下午2:24:32
 * @author Tony 
 */
@Component
public class HelloWorldService {
	private final ServiceProperties configuration;

	public HelloWorldService(ServiceProperties configuration) {
		this.configuration = configuration;
	}

	public String getHelloMessage() {
		return "Hello " + this.configuration.getName();
}
}
