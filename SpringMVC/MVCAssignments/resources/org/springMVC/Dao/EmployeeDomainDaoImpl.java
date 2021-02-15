package org.springMVC.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springMVC.services.EmployeeDomain;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDomainDaoImpl {
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	

	public List<EmployeeDomain> getListOfEmployees() {
		String query ="SELECT EmployeeId,EmployeeName,EmployeeDepartment,EmployeeDesignation,EmployeeSalary From employee_details";
		List<EmployeeDomain> list = template.query(query, new UserMapper());
		
		return list;
	}

	public int addEmployee(EmployeeDomain employee) {
		String query="INSERT INTO employee_details (EmployeeName,EmployeeDepartment,EmployeeDesignation,EmployeeSalary) values('"+employee.getEmployeeName()+"','"+employee.getEmployeeDepartment()+"','"+employee.getEmployeeDesignation()+"','"+employee.getEmployeeSalary()+"')";  
	    return template.update(query);
	}

	public int updateEmployee(EmployeeDomain employee) {
		String query="update employee_details set EmployeeName='"+employee.getEmployeeName()+"', EmployeeDepartment="+employee.getEmployeeDepartment()+",EmployeeDesignation='"+employee.getEmployeeDesignation()+",EmployeeSalary='"+employee.getEmployeeSalary()+"' where id="+employee.getEmployeeId()+"";  
	    return template.update(query);
	}
	
	public int deleteEmployee(int employeeId) {
		String query="DELETE FROM employee_details where EmployeeId="+employeeId+"";
		return template.update(query);
	}  
  
	
	
	private static final class UserMapper implements RowMapper<EmployeeDomain> {

		public EmployeeDomain mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmployeeDomain employee = new EmployeeDomain();
			employee.setEmployeeId(rs.getInt(1));
			employee.setEmployeeName(rs.getString(2));
			employee.setEmployeeDepartment(rs.getNString(3));
			employee.setEmployeeDesignation(rs.getNString(4));
			employee.setEmployeeSalary(rs.getDouble(5));
			return employee;
		}
	}

	@SuppressWarnings("deprecation")
	public EmployeeDomain findEmployee(int employeeId) {
		String query="SELECT * FROM employee_details WHERE EmployeeId=?";
		return (EmployeeDomain) template.query(query, new Object[] {employeeId},new BeanPropertyRowMapper<EmployeeDomain>(EmployeeDomain.class) );

	}
}

