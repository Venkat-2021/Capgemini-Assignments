package org.spring.Assignment5;

import org.springframework.beans.factory.annotation.Required;

public class Employee  {
	
	
	private String employeeName;
	private String employeeAddress;
	
	
	
	public String getEmployeeName() {
		return employeeName;
	}

	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	public void displayInfo() {
		System.out.println("===Employee Details===");
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Address: "+employeeAddress);
	}

}
