package com.hichem.rtibi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello1")
	public String hello(Model model) {
		model.addAttribute("message", "hello spring mvc with thymleaf");

		return "hello";
	}

}
