/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package sample.actuator;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.actuate.autoconfigure.LocalManagementPort;
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
 * @date: 2017年5月26日 下午3:03:29
 * @author Tony 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, properties = { "management.port=0",
		"management.address=127.0.0.1", "management.context-path:/admin" })
@DirtiesContext
public class ManagementAddressActuatorApplicationTests {
	@LocalServerPort
	private int port = 9010;

	@LocalManagementPort
	private int managementPort = 9011;

	@Test
	public void testHome() throws Exception {
		@SuppressWarnings("rawtypes")
		ResponseEntity<Map> entity = new TestRestTemplate().getForEntity("http://localhost:" + this.port, Map.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.UNAUTHORIZED);
	}

	@Test
	public void testHealth() throws Exception {
		ResponseEntity<String> entity = new TestRestTemplate()
				.getForEntity("http://localhost:" + this.managementPort + "/admin/health", String.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(entity.getBody()).contains("\"status\":\"UP\"");
	}

}
