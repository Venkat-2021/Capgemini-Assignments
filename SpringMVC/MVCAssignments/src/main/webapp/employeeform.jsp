<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<h1>Add New Employee</h1>
       <form:form method="post" action="save">  
      	<table >  
         <tr>  
          <td>Employee Name : </td> 
          <td><form:input path="employeeName"  /></td>
         </tr>  
         <tr>  
          <td>Employee Department :</td>  
          <td><form:input path="employeeDepartment" /></td>
         </tr> 
         <tr>  
          <td>Employee Designation :</td>  
          <td><form:input path="employeeDesignation" /></td>
         </tr> 
           <tr>  
          <td>Employee Salary :</td>  
          <td><form:input path="employeeSalary" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form> 