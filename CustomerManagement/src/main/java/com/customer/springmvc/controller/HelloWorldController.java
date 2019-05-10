package com.customer.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	@RequestMapping(value=("/"),method = RequestMethod.GET)
	public String Main(ModelMap model) 
	{
		model.addAttribute("anjum", "Welcome to Customer Management Portal");
		return "welcome";
	}
	

	
	

}
