package com.belajar.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	private String message = "Hello";
	
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("message",message);
		
		return "welcome"; //view
	}
	
	@GetMapping("/hello")
	public String mainWithParam(
			@RequestParam(name="name", required=false, defaultValue="")
			String name, Model model
			) {
		
		model.addAttribute("message",name);
		
		return "welcome"; //view
	}
}
