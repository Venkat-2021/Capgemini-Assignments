package com.spring.SpringRestAssignment;

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

@RestController
public class EmployeeDomainController {
	
	@Autowired
	private EmployeeDomainRepository employeeRepo;
	
	@GetMapping("/employee")
	public List<EmployeeDomain> getAll(){
		return employeeRepo.findAll();
	}
	
	@PostMapping("/employee")
	public EmployeeDomain createEmployee(@RequestBody EmployeeDomain employee) {
		employeeRepo.save(employee);
		return employee;
	}
	
	@GetMapping("/employee/{id}")
	public Optional<EmployeeDomain> getEmployeeById(@PathVariable("id") String id) {
		return employeeRepo.findById(id);
	}
	
	@PutMapping("/employee/{id}")
	public EmployeeDomain updateEmployeeById(@PathVariable("id") String id, @RequestBody EmployeeDomain employee) {
		employee.setEmployeeId(id);
		employeeRepo.save(employee);
		return employee;
	}
	
	@DeleteMapping("employee/{id}")
	public String deleteEmployee(@PathVariable("id") String id) {
		employeeRepo.deleteById(id);
		return id;
	}

}
