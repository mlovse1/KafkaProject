package com.cognixia.jump.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Message;

@Service
public class ConsumerService {

	// will be able to consume (pull) messages from a topic called "messages"
	// groupid -> group of topics or a group of consumers that listen to the topic
	@KafkaListener(topics = "messages", groupId = "message_group_id")
	public void consume(Message message) {
		
		System.out.println("Consuming message: " + message);
	}
	
}
