package com.mvc.eKart_project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class eKart {

	@RequestMapping("/")
	public String displayInitPage() {
		
		return "index";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String showHomePage() {
		
		return "Home";
	}
}

