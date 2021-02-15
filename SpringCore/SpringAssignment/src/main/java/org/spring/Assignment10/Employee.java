package org.spring.Assignment10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements ApplicationContextAware {
	
	
	private String employeeName;
	private Address employeeAddress;
	private ApplicationContext context = null;
	
	
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public Address getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	
	public void displayInfo() {
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Address: "+employeeAddress.getCity()+","+employeeAddress.getState()+","+employeeAddress.getCountry());
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context =context;
		System.out.println("ApplicationContext Aware");
		
	}

}
