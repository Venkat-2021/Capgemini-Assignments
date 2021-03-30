package com.spring.rabbitmq.controller;

import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rabbitmq.dto.Customer;
import com.spring.rabbitmq.service.Repository;

@RestController
public class Controller {

	@Autowired
	Customer customer;
	
	@Autowired
	private RabbitTemplate template;
	
	
	@Autowired
	private Repository repository;
	
	@PostMapping("/customer")
	public Customer createOrder(@RequestBody Customer customer ,@RequestParam("exchangename")String exchange, @RequestParam("routingkey")String key) {
		template.convertAndSend(exchange,
				key,customer);
		return customer;
		
	}
	@GetMapping("/getmessages")
    public List<Customer> get() {
		return repository.findAll();
	}
}
