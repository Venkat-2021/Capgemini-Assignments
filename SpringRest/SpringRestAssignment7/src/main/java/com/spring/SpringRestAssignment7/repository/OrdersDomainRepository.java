package com.spring.SpringRestAssignment7.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.SpringRestAssignment7.model.OrdersDomain;

public interface OrdersDomainRepository extends MongoRepository<OrdersDomain, String> {

}
