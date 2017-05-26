/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package sample.web.ui;

/**
 * ADD FUNCTION
 *
 * @date: 2017年5月26日 下午5:08:37
 * @author Tony 
 */
public interface MessageRepository {
	Iterable<Message> findAll();

	Message save(Message message);

	Message findMessage(Long id);

	void deleteMessage(Long id);
}
