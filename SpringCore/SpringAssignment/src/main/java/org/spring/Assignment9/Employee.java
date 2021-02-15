package org.spring.Assignment9;

/*import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
*/

// add  implements InitializingBean, DisposableBean for spring specific methods

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
	 * System.out.println("InitiazingBean init method..."); }
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("DispodableBean destroy method...");
	 * 
	 * }
	 */
	 
	public void myInit() {
		System.out.println("Myinit method... invoked!");
	}
	
	public void myDestroy() {
		System.out.println("Mydestroy method... invoked!");
	}
	

}
