package com.javadeveloper.kafkaapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class ConsumerService {
	private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

	@KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
	public void consume(String message){
		logger.info(String.format("Message received -> %s", message));
	}
}
