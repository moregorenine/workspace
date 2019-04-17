package com.moregorenine.home2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String showIndexPage() {
		return "index";
	}
	
	@GetMapping("/demo")
	public String showDemoPage() {
		return "demo";
	}
}
