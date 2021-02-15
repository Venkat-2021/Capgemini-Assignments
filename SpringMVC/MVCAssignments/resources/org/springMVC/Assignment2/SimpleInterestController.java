package org.springMVC.Assignment2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springMVC.services.SimpleInterestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {
	
	@RequestMapping("/simpleInterest")
	public ModelAndView simpleInterest(HttpServletRequest request,HttpServletResponse response) {
		
		double p = Double.parseDouble(request.getParameter("p"));
		double r = Double.parseDouble(request.getParameter("r"));
		double t = Double.parseDouble(request.getParameter("t"));
		
		SimpleInterestService ss = new SimpleInterestService();
		double interest = ss.sI(p, r, t);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("simpleInterestView.jsp");
		mv.addObject("interest",interest);
		
		return mv;
		
	}

}
