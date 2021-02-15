package org.springMVC.Dao;

import java.util.List;

import org.springMVC.services.EmployeeDomain;

public interface EmployeeDomainDao {
	public List<EmployeeDomain> getListOfEmployees();
	public int addEmployee(EmployeeDomain employee);
	public int updateEmployee(EmployeeDomain employee);
	public int deleteEmployee(int employeeId);
	public List<EmployeeDomain> findEmployee(String employeeName);

}

