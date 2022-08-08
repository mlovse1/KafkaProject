package com.cognixia.jump.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Message;

@Service
public class ProducerService {
	
	// help place our message onto a kafka topic
	@Autowired
	private KafkaTemplate<String, Message> kafkaTemplate;
	
	public void produce(Message message) {
		
		System.out.println("Producing message: " + message);

		// first arg: topic
		// second arg: message to place on the topic
		kafkaTemplate.send("messages", message);
	}

}
