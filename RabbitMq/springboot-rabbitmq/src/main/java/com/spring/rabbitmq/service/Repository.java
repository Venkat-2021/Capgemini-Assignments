package com.spring.rabbitmq.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.rabbitmq.dto.Customer;

public interface Repository extends MongoRepository<Customer, String> {

}
