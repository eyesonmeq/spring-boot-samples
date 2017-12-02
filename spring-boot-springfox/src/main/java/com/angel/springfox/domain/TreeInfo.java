/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.springfox.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

/**
 * ADD FUNCTION
 *
 * @date: 2017年12月2日 上午11:59:56
 * @author li_ming 
 */
public class TreeInfo implements Serializable {
	private static final long serialVersionUID = 1831917888568868859L;

	private int id;

	private String text;

	@ApiModelProperty(hidden = true)
	private List<TreeInfo> children = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<TreeInfo> getChildren() {
		return children;
	}
}
