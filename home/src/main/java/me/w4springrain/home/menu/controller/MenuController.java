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

import com.fasterxml.jackson.databind.ObjectMapper;

import me.w4springrain.home.menu.damain.ZTree;
import me.w4springrain.home.menu.damain.ZTreeWrapper;
import me.w4springrain.home.menu.service.MenuService;

@Controller
public class MenuController {
	
	private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
	
	@Autowired
	MenuService menuService;

	/**
	 * 화면의 zTree UI 정보를 Menu 객체 정보로 변환하여 테이블에 all delete & all insert
	 * @param zTreeWrapper : UI zTree 정보
	 * @param bindingResult : validation 검증결과
	 * @param model
	 * @return
	 */
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
	
	/**
	 * Menu 객체 정보를 zTree UI 정보로  변환하여 json data로 전송
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/menus", method = RequestMethod.GET)
	public String selectMenus(Model model) {
		return "tiles:menus/menus";
	}
	
	/**
	 * Menu 객체 정보를 zTree UI 정보로  변환하여 json data로 전송
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/menusZtree", method = RequestMethod.GET)
	public String selectMenusZtree(Model model) {
		List<ZTree> zTrees = menuService.selectMenus2ZTree();
		
		ObjectMapper mapper = new ObjectMapper();
		String jsZTrees = "";
		try {
			jsZTrees = mapper.writeValueAsString(zTrees);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("jsZTrees", jsZTrees);
		return "menus/menusZtree";
	}
	
}
