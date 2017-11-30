/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.activiti.common.exception;

/**
 * 自定义针对service异常
 *
 * @date: 2017年11月28日 下午5:09:30
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
