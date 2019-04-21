package com.w4springrain.home3.datatables.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataTablesController {

	@GetMapping("/datatables")
	public String dataTablesExample() {
		return "views/datatables/main";
	}
}
