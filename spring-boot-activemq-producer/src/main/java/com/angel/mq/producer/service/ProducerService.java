/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.mq.producer.service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.angel.mq.producer.info.OrderInfo;

/**
 * ADD FUNCTION
 *
 * @date: 2017年11月28日 下午12:09:13
 * @author li_ming 
 */
@Component
public class ProducerService {
	Logger log = LogManager.getLogger(getClass());
	@Autowired
	private JmsTemplate jmsTemplate;
	@Autowired
	private ActiveMQQueue helloQueue;

	/**
	 * 发送Text消息队列
	 * @param message
	 */
	public void sendTextQueueMessage(final String message) {
		jmsTemplate.send(helloQueue, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		});
	}

	/**
	 * 发送消息并处理消息返回值
	 * @param message
	 * @throws JMSException 
	 */
	public String sendTextQueueMessageAndReceive(final String message) throws JMSException {
		Message replyMessage = jmsTemplate.sendAndReceive(helloQueue, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		});

		log.info("sendTextAndReceive: {}", JSON.toJSONString(replyMessage));
		TextMessage textMessage = (TextMessage) replyMessage;
		return textMessage.getText();
	}

	/**
	 * 订单入队列
	 * @param info
	 * @throws JMSException 
	 */
	public String sendObjectQueueMessage(final OrderInfo info) throws JMSException {
		Message message = jmsTemplate.sendAndReceive(helloQueue, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createObjectMessage(info);
			}
		});

		log.info("sendTextAndReceive: {}", JSON.toJSONString(message));
		TextMessage textMessage = (TextMessage) message;
		return textMessage.getText();
	}
}
