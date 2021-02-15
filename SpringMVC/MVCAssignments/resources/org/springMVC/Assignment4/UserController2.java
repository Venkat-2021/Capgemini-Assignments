package org.springMVC.Assignment4;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springMVC.Dao.UserModelDaoImpl;
import org.springMVC.services.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController2 {
	
	@Autowired
	UserModelDaoImpl userModelDaoImpl;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
	      @ModelAttribute("user") UserModel user) {

	    userModelDaoImpl.registerUser(user);
	    
	    return new ModelAndView("userlogin.jsp");
	  }
	
	@RequestMapping(value = "/userlogin", method = RequestMethod.GET)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	      @ModelAttribute("login") UserModel user) {
	    ModelAndView mv = null;

	    UserModel userModel = userModelDaoImpl.validateUser(user);

	    if (null != userModel) {
	      mv = new ModelAndView("success.jsp");
	      //mav.addObject("firstname", user.getUsername());
	    } else {
	      mv = new ModelAndView("error.jsp");
	      //mav.addObject("message", "Username or Password is wrong!!");
	    }

	    return mv;
	  }
}
