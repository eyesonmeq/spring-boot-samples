/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.common.captcha;

import java.util.Properties;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月28日 下午4:38:22
 * @author li_ming 
 */
public class NumericKaptcha extends AbstractBaseKaptcha {
	@Override
	public Properties getProperties() {
		Properties props = new Properties();
		props.put("kaptcha.border", "no");
		props.put("kaptcha.textproducer.font.color", "black");
		props.put("kaptcha.textproducer.char.space", "5");
		props.put("kaptcha.textproducer.char.length", "4");
		props.put("kaptcha.textproducer.char.string", "0123456789");
		return props;
	}
}
