package org.springMVC.Assignment1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/show")
	public String show() {
		return "helloWorld.jsp";
	}

}
