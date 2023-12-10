package com.prod.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	@KafkaListener(topics = "testTopic", groupId = "console-consumer-97824")
	public void listenToTopic(String recMsg) {
		System.out.println("Message listened from topic : "+recMsg);
	}
}
