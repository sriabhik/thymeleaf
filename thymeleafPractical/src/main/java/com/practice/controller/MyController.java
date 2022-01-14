package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;
@Controller
public class MyController {
	
	@RequestMapping(value = "/about",method=RequestMethod.GET)
	
	public String about(Model model) {
		System.out.println("Inside about Handler");
		model.addAttribute("name","Abhishek");
		model.addAttribute("currentDate",new Date().toLocaleString());
		return "about";
	}
}
