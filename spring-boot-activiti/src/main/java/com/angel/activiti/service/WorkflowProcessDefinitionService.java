/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.zip.ZipInputStream;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.angel.activiti.utils.FileExtUtils;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月28日 下午6:32:57
 * @author li_ming 
 */
@Service
public class WorkflowProcessDefinitionService {
	private Logger logger = LogManager.getLogger(getClass());
	@Autowired
	private RepositoryService repositoryService;
	@Value("${Deploy.imgPath}")
	private String exportDir;

	public void deployFromClasspath(String processKey) {
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		String deployPath = "classpath:/processes/" + processKey + ".bpmn20.xml";
		Resource resource = resourceLoader.getResource(deployPath);
		try {
			InputStream is = resource.getInputStream();
			if (is == null) {
				logger.warn("ignore deploy workflow module: {}", deployPath);
				return;
			}

			ZipInputStream zipInputStream = new ZipInputStream(is, Charset.forName("UTF-8"));
			Deployment deployment = repositoryService.createDeployment().name(processKey)
					.addZipInputStream(zipInputStream).deploy();
			List<ProcessDefinition> list = repositoryService.createProcessDefinitionQuery()
					.deploymentId(deployment.getId()).list();
			for (ProcessDefinition processDefinition : list) {
				FileExtUtils.exportDiagramToFile(repositoryService, processDefinition, exportDir);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
