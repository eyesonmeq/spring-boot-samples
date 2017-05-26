/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package sample.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * ADD FUNCTION
 *
 * @date: 2017年5月26日 下午2:25:07
 * @author Tony 
 */
@SpringBootApplication
@EnableConfigurationProperties(ServiceProperties.class)
public class SampleActuatorApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleActuatorApplication.class, args);
	}

	@Bean
	public HealthIndicator helloHealthIndicator() {
		return new HealthIndicator() {
			@Override
			public Health health() {
				return Health.up().withDetail("hello", "world").build();
			}
		};
	}

}
