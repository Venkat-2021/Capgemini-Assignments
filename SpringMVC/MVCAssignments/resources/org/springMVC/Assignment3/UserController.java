package org.springMVC.Assignment3;


import org.springMVC.services.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/userlogin")
	public ModelAndView userlogin(@ModelAttribute("user") UserModel user) {
		
		ModelAndView mv = new ModelAndView();
		
		  if (user.getUsername().equals("sai") && user.getPassword().equals("Venkat@123")) {
		  mv.setViewName("success.jsp");
		  
		  return mv; } else { mv.setViewName("error.jsp");
		  
		  return mv; }
	
	}
	

}
