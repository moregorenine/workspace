package me.w4springrain.home.menu.service;

import java.util.List;

import me.w4springrain.home.menu.damain.Menu;
import me.w4springrain.home.menu.damain.ZTree;
import me.w4springrain.home.menu.damain.ZTreeWrapper;

public interface MenuService {

	/**
	 * 메뉴 목록 조회
	 * @return menu List
	 */
	List<Menu> selectMenus();
	
	/**
	 * 메뉴 목록 조회
	 * @return ZTree List
	 */
	List<ZTree> selectMenus2ZTree();

	/**
	 * 화면의 zTree UI 정보를 Menu 객체 정보로 변환하여 테이블에 all delete & all insert
	 * Menu All Insert
	 * @param zTreeWrapper
	 */
	void createMenu(ZTreeWrapper zTreeWrapper);
	
	/**
	 * Menu 객체를 저장한다.
	 * Menu Insert
	 * @param menu
	 * @return
	 */
	int createMenu(Menu menu);

	/**
	 * Menu All Delete
	 * @return delete total count
	 */
	int deleteMenu();
	
}
