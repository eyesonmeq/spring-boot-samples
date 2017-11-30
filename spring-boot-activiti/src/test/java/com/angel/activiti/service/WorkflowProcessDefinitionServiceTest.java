/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月29日 下午6:27:32
 * @author li_ming 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkflowProcessDefinitionServiceTest {
	@Autowired
	private WorkflowProcessDefinitionService workflowProcessDefinitionService;

	@Test
	public void deploy() {
		workflowProcessDefinitionService.deployFromClasspath("MyProcess");
	}
}
