/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package sample.actuator;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.LocalManagementPort;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.context.embedded.LocalServerPort;
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
 * @date: 2017年5月26日 下午3:13:24
 * @author Tony 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, properties = { "management.port=0" })
@DirtiesContext
public class ManagementPortSampleActuatorApplicationTests {
	@Autowired
	private SecurityProperties security;

	@LocalServerPort
	private int port = 9010;

	@LocalManagementPort
	private int managementPort = 9011;

	@Test
	public void testHome() throws Exception {
		@SuppressWarnings("rawtypes")
		ResponseEntity<Map> entity = new TestRestTemplate("user", getPassword())
				.getForEntity("http://localhost:" + this.port, Map.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		@SuppressWarnings("unchecked")
		Map<String, Object> body = entity.getBody();
		assertThat(body.get("message")).isEqualTo("Hello Phil");
	}

	@Test
	public void testMetrics() throws Exception {
		testHome(); // makes sure some requests have been made
		@SuppressWarnings("rawtypes")
		ResponseEntity<Map> entity = new TestRestTemplate()
				.getForEntity("http://localhost:" + this.managementPort + "/metrics", Map.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.UNAUTHORIZED);
	}

	@Test
	public void testHealth() throws Exception {
		ResponseEntity<String> entity = new TestRestTemplate()
				.getForEntity("http://localhost:" + this.managementPort + "/health", String.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(entity.getBody()).contains("\"status\":\"UP\"");
	}

	@Test
	public void testErrorPage() throws Exception {
		@SuppressWarnings("rawtypes")
		ResponseEntity<Map> entity = new TestRestTemplate()
				.getForEntity("http://localhost:" + this.managementPort + "/error", Map.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		@SuppressWarnings("unchecked")
		Map<String, Object> body = entity.getBody();
		assertThat(body.get("status")).isEqualTo(999);
	}

	private String getPassword() {
		return this.security.getUser().getPassword();
	}
}
