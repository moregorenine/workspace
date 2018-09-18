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
	 * @param zTreeWrapper 메뉴 정보
	 * @return Insert total count
	 */
	int createMenu(ZTreeWrapper zTreeWrapper);

	/**
	 * Menu All Delete
	 * @return delete total count
	 */
	int deleteMenu();


}
