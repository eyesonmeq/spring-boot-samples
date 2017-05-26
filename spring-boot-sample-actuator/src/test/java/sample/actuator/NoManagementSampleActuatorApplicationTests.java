/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package sample.actuator;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ADD FUNCTION
 *
 * @date: 2017年5月26日 下午3:18:24
 * @author Tony 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, properties = { "management.port=-1" })
@DirtiesContext
public class NoManagementSampleActuatorApplicationTests {
	@Autowired
	private SecurityProperties security;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testHome() throws Exception {
		@SuppressWarnings("rawtypes")
		ResponseEntity<Map> entity = this.restTemplate.withBasicAuth("user", getPassword()).getForEntity("/",
				Map.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		@SuppressWarnings("unchecked")
		Map<String, Object> body = entity.getBody();
		assertThat(body.get("message")).isEqualTo("Hello Phil");
	}

	@Test
	public void testMetricsNotAvailable() throws Exception {
		testHome(); // makes sure some requests have been made
		@SuppressWarnings("rawtypes")
		ResponseEntity<Map> entity = this.restTemplate.withBasicAuth("user", getPassword()).getForEntity("/metrics",
				Map.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	}

	private String getPassword() {
		return this.security.getUser().getPassword();
	}
}
