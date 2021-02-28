package com.spring.SpringRestAssignment;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeDomainRepository extends MongoRepository<EmployeeDomain, String> {

}
