package com.itc.rabbitmqDemo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqDemoApplication implements CommandLineRunner{

	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(RabbitmqDemoApplication.class, args);
	
	}
	
	@Override
	public void run(String... args) throws Exception {
	
		SimpleMessage simpleMessage = new SimpleMessage();
		simpleMessage.setName("First simple Message");
		simpleMessage.setDescription("simple first Description");
		rabbitTemplate.convertAndSend("MyTopicExchange", "topic", simpleMessage);
	}
	
}
