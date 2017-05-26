/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package sample.profile.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * ADD FUNCTION
 *
 * @date: 2017年5月26日 下午4:27:54
 * @author Tony 
 */
@Component
@Profile({ "generic" })
public class GenericService implements MessageService {
	@Value("${hello:Hello}")
	private String hello;

	@Value("${name:World}")
	private String name;

	@Override
	public String getMessage() {
		return this.hello + " " + this.name;
	}
}
