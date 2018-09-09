package me.w4springrain.home.menu.service;

import java.util.List;

import me.w4springrain.home.menu.damain.Menu;

public interface MenuService {

	/**
	 * 메뉴 생성
	 * @param menus 
	 * @return
	 */
	int createMenu(List<Menu> menus);
	
	/**
	 * 메뉴 목록 조회
	 * @return
	 */
	List<Menu> selectMenus();


}
