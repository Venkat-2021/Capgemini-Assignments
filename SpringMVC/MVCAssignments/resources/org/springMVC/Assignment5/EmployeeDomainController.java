package org.springMVC.Assignment5;

import java.util.List;
import org.springMVC.Dao.EmployeeDomainDaoImpl;
import org.springMVC.services.EmployeeDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeDomainController {
	
	@Autowired
	EmployeeDomainDaoImpl employeeDaoImpl;
	
	
	  @RequestMapping("/employeeform") public String showform(Model m){
	  m.addAttribute("command", new EmployeeDomain()); return "employeeform.jsp"; }
	  
	
	 @RequestMapping(value="/save",method = RequestMethod.POST)  
	    public String save(@ModelAttribute("employeeDomain") EmployeeDomain emplopeeDomain){  
	        employeeDaoImpl.addEmployee(emplopeeDomain);  
	        return "redirect:/viewemployee";
		}
	 
	
	@RequestMapping(value="/viewemployee")
	public ModelAndView listEmployees() {
		ModelAndView mvn = new ModelAndView("viewemployee.jsp");
		List<EmployeeDomain> list = employeeDaoImpl.getListOfEmployees();
		mvn.addObject("list",list);
		return mvn;
	}
	
	@RequestMapping(value="/editemployee/{employeeId}")  
    public String edit(@PathVariable int employeeId, Model m){  
        EmployeeDomain employee=(EmployeeDomain) employeeDaoImpl.findEmployee(employeeId);  
        m.addAttribute("command",employee);
        return "empeloyeeditform";  
    } 
	
	@RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("employeeDomain") EmployeeDomain emplopeeDomain){  
        employeeDaoImpl.updateEmployee(emplopeeDomain);  
        return "redirect:/viewemployee";  
    }  
	
	@RequestMapping(value="/deleteemployee/{id}",method = RequestMethod.GET)  
    public String delete(@PathVariable int id){  
        employeeDaoImpl.deleteEmployee(id);  
        return "redirect:/viewemployee";  
    }  
	
	
	
	
	
	

}
