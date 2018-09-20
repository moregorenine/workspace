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
	
	/**
	 * seqNm의 현재 시퀀스 정보 조회
	 * @param seqNm : 시퀀스명
	 * @return
	 */
	int selectCurrvalSeq(String seqNm);


}
