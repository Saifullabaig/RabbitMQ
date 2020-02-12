package com.itc.rabbitlistnerproject;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQExchangeConfiguration {
	
	@Bean
	Exchange exampleExchange() {
		return new TopicExchange("ExampleExchnage");
	}
	
	@Bean
	Exchange exmaple2ndExchange() {
		return ExchangeBuilder.directExchange("Example2ndExchaneg")
				.autoDelete()
				.internal()
				.build();
	}
	
	@Bean
	Exchange newExchange() {
		return ExchangeBuilder.topicExchange("TopicExchange")
				.autoDelete()
				.durable(true)
				.internal()
				.build();
	}
	
	@Bean
	Exchange fanoutExchange() {
		return ExchangeBuilder.fanoutExchange("FanoutTestExchange")
				.autoDelete()
				.durable(false)
				.internal()
				.build();
	}
	
	@Bean
	Exchange headersExchange() {
		return ExchangeBuilder.headersExchange("HeadersTestExchange")
				.internal()
				.durable(true)
				.ignoreDeclarationExceptions()
				.build();
	}
}
