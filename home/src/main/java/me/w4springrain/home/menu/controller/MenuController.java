package me.w4springrain.home.menu.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import me.w4springrain.home.menu.damain.Menu;
import me.w4springrain.home.menu.damain.ZTreeWrapper;
import me.w4springrain.home.menu.service.MenuService;

@Controller
public class MenuController {
	
	private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
	
	@Autowired
	MenuService menuService;

	@RequestMapping(value = "/menus", method = RequestMethod.POST)
	@ResponseBody
	public ZTreeWrapper createMenu(@RequestBody @Valid ZTreeWrapper zTreeWrapper, BindingResult bindingResult, Model model) {
		zTreeWrapper.checkErrors(bindingResult);
		if(zTreeWrapper.getErrors().isEmpty()) {
			logger.debug("@Valid Check 오류 없을 경우 저장 실행");
			menuService.createMenu(zTreeWrapper);
		}
		return zTreeWrapper;
	}
	
	@RequestMapping(value = "/menus", method = RequestMethod.GET)
	public String selectMenus(Model model) {
		List<Menu> menus = menuService.selectMenus();
		model.addAttribute("menus", menus);
		return "tiles:menus/menus";
	}
	
}
