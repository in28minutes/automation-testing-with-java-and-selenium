package com.in28minutes.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String showWelcomePage(ModelMap model) {
		if(!model.containsAttribute("name"))
			return "redirect:/login";

		return "welcome";
	}
}
