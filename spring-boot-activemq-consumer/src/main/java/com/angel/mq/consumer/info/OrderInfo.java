/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.mq.consumer.info;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单信息
 *
 * @date: 2017年11月28日 上午11:36:42
 * @author li_ming 
 */
public class OrderInfo implements Serializable {

	private static final long serialVersionUID = 1196327608575230459L;

	// 商品ID
	private int goodsId;
	// 商品名称
	private String goods;
	// 商品价格
	private float price;
	// 订单时间
	private Date createTime;

	public OrderInfo(int goodsId, String goods, float price) {
		this.goodsId = goodsId;
		this.goods = goods;
		this.price = price;
		this.createTime = new Date();
	}

	public String getGoods() {
		return goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

}
