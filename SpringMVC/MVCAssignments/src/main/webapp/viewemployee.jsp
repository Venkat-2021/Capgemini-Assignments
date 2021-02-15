<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<h1>Employees List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>EmployeeName</th><th>EmployeeDepartment</th><th>EmployeeDesignation</th><th>EmployeeSalary</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="employeeDomain" items="${list}"> 
    <tr>
    <td>${employeeDomain.employeeId}</td>
    <td>${employeeDomain.employeeName}</td>
    <td>${employeeDomain.employeeDepartment}</td>
    <td>${employeeDomain.employeeDesignation}</td>
     <td>${employeeDomain.employeeSalary}</td>
    <td><a href="editemployee/${employeeDomain.employeeId}">Edit</a></td>
    <td><a href="deleteemployee/${employeeDomain.employeeId}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="employeeform">Add New Employee</a>