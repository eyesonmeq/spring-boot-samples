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
 * @date: 2017年5月26日 下午4:29:26
 * @author Tony 
 */
@Component
@Profile("goodbye")
public class GoodbyeWorldService implements MessageService {

	@Value("${name:World}")
	private String name;

	@Override
	public String getMessage() {
		return "Goodbye " + this.name;
	}

}
