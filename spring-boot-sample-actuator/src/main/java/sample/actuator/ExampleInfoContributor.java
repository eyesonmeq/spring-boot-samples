/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package sample.actuator;

import java.util.Collections;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * ADD FUNCTION
 *
 * @date: 2017年5月26日 下午2:23:20
 * @author Tony 
 */
@Component
public class ExampleInfoContributor implements InfoContributor {

	/* 
	 * @see org.springframework.boot.actuate.info.InfoContributor#contribute(org.springframework.boot.actuate.info.Info.Builder)
	 */
	@Override
	public void contribute(Builder builder) {
		builder.withDetail("example", Collections.singletonMap("someKey", "someValue"));
	}

}
