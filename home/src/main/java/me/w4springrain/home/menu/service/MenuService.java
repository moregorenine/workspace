package me.w4springrain.home.menu.service;

import java.util.List;

import me.w4springrain.home.menu.damain.Menu;
import me.w4springrain.home.menu.damain.ZTreeWrapper;

public interface MenuService {

	/**
	 * 메뉴 목록 조회
	 * @return menu List
	 */
	List<Menu> selectMenus();

	/**
	 * Menu All Insert
	 * @param zTreeWrapper
	 */
	void createMenu(ZTreeWrapper zTreeWrapper);

	/**
	 * Menu All Delete
	 * @return delete total count
	 */
	int deleteMenu();


}
