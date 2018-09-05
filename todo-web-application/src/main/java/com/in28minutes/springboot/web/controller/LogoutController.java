package com.in28minutes.springboot.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logOut(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
}