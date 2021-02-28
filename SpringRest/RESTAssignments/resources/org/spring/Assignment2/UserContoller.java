package org.spring.Assignment2;

import org.spring.service.UserModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContoller {
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestBody UserModel user) {
		if (user.getPassword() != null &&  user.getUsername()!= null &&  user.getUsername().equals("sai") && user.getPassword().equals("Venkat@123")) {
			  return "success";
			  
		} else { 
			return "error";
		}
	}
}
