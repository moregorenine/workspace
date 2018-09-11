package me.w4springrain.home.menu.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import me.w4springrain.home.menu.damain.Menu;
import me.w4springrain.home.menu.damain.ZTreeWrapper;
import me.w4springrain.home.menu.service.MenuService;

@Controller
@RequestMapping(value = "/menus")
public class MenuController {
	
	private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
	
	@Autowired
	MenuService menuService;

	@RequestMapping(value = "", method = RequestMethod.POST)
//	@ResponseBody
	public String createMenu(@RequestBody ZTreeWrapper zTrees, Model model) {
		logger.debug("createMenu Start");
//		int resultCnt = menuService.createMenu(zTrees);
		logger.debug("createMenu End");
//		logger.debug("createMenu Count : ", resultCnt);
		return "redirect:menus";
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String selectMenus(Model model) {
		List<Menu> menus = menuService.selectMenus();
		model.addAttribute("menus", menus);
		return "tiles:menus/menus";
	}
	
}
