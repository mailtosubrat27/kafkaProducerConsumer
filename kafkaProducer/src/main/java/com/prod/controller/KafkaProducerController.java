package com.prod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prod.service.ConsumerService;
import com.prod.service.ProducerService;

@RestController
@RequestMapping("/api")
public class KafkaProducerController {
	
	@Autowired
	ProducerService producer;
	
	@Autowired
	ConsumerService consumer;
	
	@GetMapping("/producer")
	public String sendMessageToKafka(@RequestParam("message") String message) {
		System.out.println("Producer - "+message);
		producer.sendMessageToKafka(message);
		
		consumer.listenToTopic(message);
				
		return "Produce message and listen message is successful.. thank you!!";		
	}

}
