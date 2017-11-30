/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.common.captcha;

import java.util.HashMap;
import java.util.Map;

/**
 * 验证码工厂
 *
 * @date: 2017年11月28日 下午4:36:43
 * @author li_ming 
 */
public class KaptchaFactory {
	private static Map<Integer, AbstractBaseKaptcha> map = new HashMap<>();

	static {
		map.put(KaptchaType.SIMPLE.value(), new SimpleKaptcha());
		map.put(KaptchaType.NUMERIC.value(), new NumericKaptcha());
		map.put(KaptchaType.ALPHABETIC.value(), new AlphabeticKaptcha());
	}

	private KaptchaFactory() {

	}

	private static class InstanceHolder {
		public static KaptchaFactory instance = new KaptchaFactory();
	}

	public static KaptchaFactory getInstance() {
		return InstanceHolder.instance;
	}

	public AbstractBaseKaptcha creator(Integer type) {
		return map.get(type);
	}
}
