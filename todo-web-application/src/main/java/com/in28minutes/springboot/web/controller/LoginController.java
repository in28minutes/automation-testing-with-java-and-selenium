package com.in28minutes.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.springboot.web.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String rootPage(){
		return "redirect:/login";
	}

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model){
		if(model.containsAttribute("name"))
			return "redirect:/welcome";
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
		
		boolean isValidUser = service.validateUser(name, password);
		
		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
			
		model.addAttribute("name",name);
		return "redirect:/welcome";
	}

}