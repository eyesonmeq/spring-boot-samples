/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.common.sitemesh;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**
 * 配置装饰器
 *
 * @date: 2017年11月28日 下午6:19:10
 * @author li_ming 
 */
public class WebSiteMeshFilter extends ConfigurableSiteMeshFilter {
	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder.addDecoratorPath("/admin/**", "/admin/index").addExcludedPath("/admin/index")
				.addExcludedPath("/plugin/**").addExcludedPath("/login").addExcludedPath("/logout")
				.addExcludedPath("/kaptcha/**").addExcludedPath("/error/**");
	}
}
