package com.spring.SpringRestAssignment7.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Orders")
public class OrdersDomain {
	
	@Id
	private String orderId;
	private String productName;
	private String productCost;
	private String orderQuantity;
	
	public OrdersDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OrdersDomain(String orderId, String productName, String productCost, String orderQuantity) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.productCost = productCost;
		this.orderQuantity = orderQuantity;
	}
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCost() {
		return productCost;
	}
	public void setProductCost(String productCost) {
		this.productCost = productCost;
	}
	public String getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(String orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	
	

}
