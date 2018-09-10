package me.w4springrain.home.menu.service;

import java.util.List;

import me.w4springrain.home.menu.damain.Menu;
import me.w4springrain.home.menu.damain.ZTree;

public interface MenuService {

	/**
	 * 메뉴 생성
	 * @param zTrees 
	 * @return
	 */
	int createMenu(List<ZTree> zTrees);
	
	/**
	 * 메뉴 목록 조회
	 * @return
	 */
	List<Menu> selectMenus();


}
