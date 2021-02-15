package org.spring.Assignment8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
*/


// 1.add  implements InitializingBean, DisposableBean for spring specific methods
// 2.Custom init and destroy method
// 3.Using Annotations

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
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Address: "+employeeAddress);
	}

	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("InitiazingBean init method... invoked!"); }
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("DispodableBean destroy method... invoked!");
	 * 
	 * }
	 */
	 
	/*
	 * public void myInit() { System.out.println("Custom init method... invoked!"); }
	 * 
	 * public void myDestroy() { System.out.println("Custom destroy method... invoked!");
	 * }
	 */
	@PostConstruct
	public void init() throws Exception {
		System.out.println("Annotation based init method... invoked!");
	}
	
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Annotation based destroy method... invoked!");
	}

}
