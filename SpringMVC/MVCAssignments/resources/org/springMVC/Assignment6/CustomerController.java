package org.springMVC.Assignment6;

import javax.validation.Valid;

import org.springMVC.services.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	@RequestMapping(value="regestration", method = RequestMethod.GET)
	public Customer customer(){
		return new Customer(); 
	}
	@RequestMapping(value="regestration", method = RequestMethod.POST)
	public ModelAndView createUser(@ModelAttribute("user") @Valid Customer customer,BindingResult result,ModelMap model) {
	        if(result.hasErrors()) {
	    	    return new ModelAndView("regestration");
	        }
	
		return new ModelAndView("redirect:success.jsp");
	}
	
	

}
