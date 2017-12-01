/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.quartz.common.exception;

/**
 * 自定义针对service异常
 *
 * @date: 2017年12月1日 下午5:06:07
 * @author li_ming 
 */
public class ServiceException extends RuntimeException {
	private static final long serialVersionUID = 8624944628363400977L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}
}
