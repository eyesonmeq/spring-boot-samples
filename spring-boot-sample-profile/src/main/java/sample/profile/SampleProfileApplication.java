/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package sample.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sample.profile.service.MessageService;

/**
 * ADD FUNCTION
 *
 * @date: 2017年5月26日 下午4:23:47
 * @author Tony 
 */
@SpringBootApplication
public class SampleProfileApplication implements CommandLineRunner {
	@Autowired
	private MessageService helloWorldService;

	/* 
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.helloWorldService.getMessage());
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleProfileApplication.class, args);
	}

}
