package com.saraya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginPage() {
		return "login";
			
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String showPage(ModelMap model) {
		return "welcome";
   }
}