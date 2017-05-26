/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package sample.profile;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.rule.OutputCapture;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ADD FUNCTION
 *
 * @date: 2017年5月26日 下午4:32:24
 * @author Tony 
 */
public class SampleProfileApplicationTests {
	@Rule
	public OutputCapture outputCapture = new OutputCapture();

	private String profiles;

	@Before
	public void before() {
		this.profiles = System.getProperty("spring.profiles.active");
	}

	@After
	public void after() {
		if (this.profiles != null) {
			System.setProperty("spring.profiles.active", this.profiles);
		} else {
			System.clearProperty("spring.profiles.active");
		}
	}

	@Test
	public void testDefaultProfile() throws Exception {
		SampleProfileApplication.main(new String[0]);
		String output = this.outputCapture.toString();
		assertThat(output).contains("Hello Phil");
	}

	@Test
	public void testGoodbyeProfile() throws Exception {
		System.setProperty("spring.profiles.active", "goodbye");
		SampleProfileApplication.main(new String[0]);
		String output = this.outputCapture.toString();
		assertThat(output).contains("Goodbye Everyone");
	}

	@Test
	public void testGenericProfile() throws Exception {
		/*
		 * This is a profile that requires a new environment property, and one which is
		 * only overridden in the current working directory. That file also only contains
		 * partial overrides, and the default application.yml should still supply the
		 * "name" property.
		 */
		System.setProperty("spring.profiles.active", "generic");
		SampleProfileApplication.main(new String[0]);
		String output = this.outputCapture.toString();
		assertThat(output).contains("Bonjour Phil");
	}

	@Test
	public void testGoodbyeProfileFromCommandline() throws Exception {
		SampleProfileApplication.main(new String[] { "--spring.profiles.active=goodbye" });
		String output = this.outputCapture.toString();
		assertThat(output).contains("Goodbye Everyone");
	}
}
