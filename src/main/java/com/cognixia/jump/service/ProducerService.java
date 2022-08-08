package com.cognixia.jump.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Message;
import com.cognixia.jump.model.Orders;
import com.cognixia.jump.repository.OrderRepository;

@Service
public class ProducerService {
	
	// help place our message onto a kafka topic
	@Autowired
	OrderRepository repository;
	//change to orders
	//private KafkaTemplate<String, Message> kafkaTemplate;
	private KafkaTemplate<String, Orders> kafkaTemplate;
	
	public void produce(Orders purchaseMade) {
		
		System.out.println("Producing message: " + purchaseMade);

		// first arg: topic
		// second arg: message to place on the topic
		kafkaTemplate.send("purchaseMade", purchaseMade);
		repository.save(purchaseMade);
	}

}
