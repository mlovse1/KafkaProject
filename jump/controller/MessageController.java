package com.cognixia.jump.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Message;
import com.cognixia.jump.service.ProducerService;

@RestController
public class MessageController {
	
	@Autowired
	ProducerService service;
	
	// uri: localhost:8080/generate?msg=Hello
	
	@GetMapping("/generate")
	public Message generateMessage(@RequestParam String msg) {
		
		Message message = new Message(msg, new Date());
		
		service.produce(message);
		
		return message;
	}

}
