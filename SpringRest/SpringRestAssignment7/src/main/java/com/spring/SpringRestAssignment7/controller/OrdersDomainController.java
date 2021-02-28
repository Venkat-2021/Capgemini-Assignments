package com.spring.SpringRestAssignment7.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.SpringRestAssignment7.model.OrdersDomain;
import com.spring.SpringRestAssignment7.repository.OrdersDomainRepository;

@RestController
public class OrdersDomainController {
	
	@Autowired
	private OrdersDomainRepository ordersRepo;

	@GetMapping("/orders")
	public List<OrdersDomain> getAll(){
		return ordersRepo.findAll();
	}
	
	@PostMapping("/orders")
	public OrdersDomain createOrder(@RequestBody OrdersDomain orders) {
		ordersRepo.save(orders);
		return orders;
	}
	
	@GetMapping("/orders/{id}")
	public Optional<OrdersDomain> getOrderById(@PathVariable("id") String id){
		return ordersRepo.findById(id);
	}
	
	@PutMapping("/orders/{id}")
	public OrdersDomain updateOrderById(@PathVariable("id") String id, @RequestBody OrdersDomain orders) {
		orders.setOrderId(id);
		ordersRepo.save(orders);
		return orders;
	}
	
	@DeleteMapping("/orders/{id}")
	public String deleteOrders(@PathVariable("id") String id) {
		ordersRepo.deleteById(id);
		return id;
	}
}
