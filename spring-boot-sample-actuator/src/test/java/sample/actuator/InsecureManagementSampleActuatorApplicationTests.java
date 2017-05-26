/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package sample.actuator;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ADD FUNCTION
 *
 * @date: 2017年5月26日 下午2:50:10
 * @author Tony 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, properties = { "management.security.enabled:false" })
@DirtiesContext
@ActiveProfiles("unsecure-management")
public class InsecureManagementSampleActuatorApplicationTests {
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testHomeIsSecure() throws Exception {
		@SuppressWarnings("rawtypes")
		ResponseEntity<Map> entity = this.restTemplate.getForEntity("/", Map.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.UNAUTHORIZED);
		@SuppressWarnings("unchecked")
		Map<String, Object> body = entity.getBody();
		assertThat(body.get("error")).isEqualTo("Unauthorized");
		assertThat(entity.getHeaders()).doesNotContainKey("Set-Cookie");
	}

	@Test
	public void testMetrics() throws Exception {
		try {
			testHomeIsSecure(); // makes sure some requests have been made
		} catch (AssertionError ex) {
			// ignore;
		}
		@SuppressWarnings("rawtypes")
		ResponseEntity<Map> entity = this.restTemplate.getForEntity("/metrics", Map.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		@SuppressWarnings("unchecked")
		Map<String, Object> body = entity.getBody();
		assertThat(body).containsKey("counter.status.401.unmapped");
	}
}
