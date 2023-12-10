package com.prod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
	
	@Autowired
	KafkaTemplate<String, String> template;
	public void sendMessageToKafka(String message) {
		template.send("testTopic", message);
	}

}
