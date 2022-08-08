package com.cognixia.jump.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Message;
import com.cognixia.jump.model.Orders;
import com.cognixia.jump.service.ProducerService;

@RestController
public class OrdersController {
	
	@Autowired
	ProducerService service;
	
	// uri: localhost:8080/generate?msg=Hello
	
	@GetMapping("/generate")
//	public Message generateMessage(@RequestParam String msg) {
	public Orders generateNewOrder(@RequestBody Orders order) {	
		//Message message = new Message(msg, new Date());
		
		service.produce(order);
		
		return order;
	}

}
