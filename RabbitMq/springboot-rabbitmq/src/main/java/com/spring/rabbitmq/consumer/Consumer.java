package com.spring.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.spring.rabbitmq.config.MessagingConfig;
import com.spring.rabbitmq.dto.Customer;
import com.spring.rabbitmq.service.Repository;


@Component
public class Consumer {
	@Autowired
    Repository repository;
    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(Customer customer) {
    	repository.save(customer);
    }


}
