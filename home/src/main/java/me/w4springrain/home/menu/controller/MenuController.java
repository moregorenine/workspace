package me.w4springrain.home.menu.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import me.w4springrain.home.menu.damain.Menu;
import me.w4springrain.home.menu.service.MenuService;

@Controller
@SessionAttributes("menus")
@RequestMapping(value = "/menus")
public class MenuController {
	
	private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
	
	@Autowired
	MenuService menuService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public String createMenu(@ModelAttribute List<Menu> menus, Model model) {
		logger.debug("createMenu Start");
		int resultCnt = menuService.createMenu(menus);
		logger.debug("createMenu End");
		logger.debug("createMenu Count : ", resultCnt);
		return "redirect:home";
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String selectMenus(@ModelAttribute Menu menu, Model model) {
		List<Menu> menus = menuService.selectMenus();
		model.addAttribute("menus", menus);
		return "tiles:menus/menus";
	}
	
}
