/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.sitemesh.common;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**
 * 配置装饰器
 *
 * @date: 2017年12月2日 上午11:46:54
 * @author li_ming 
 */
public class WebSiteMeshFilter extends ConfigurableSiteMeshFilter {
	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder.addDecoratorPath("/admin/*", "/admin/index").addExcludedPath("/admin/index")
				.addExcludedPath("/plugin/*");
	}
}
