package me.w4springrain.home.menu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import me.w4springrain.home.menu.damain.Menu;
import me.w4springrain.home.menu.damain.ZTree;
import me.w4springrain.home.menu.damain.ZTreeWrapper;
import me.w4springrain.home.menu.dao.MenuDao;
import me.w4springrain.home.menu.service.MenuService;

@Service("menuService")
public class MenuServiceImpl implements MenuService {

	private static final Logger logger = LoggerFactory.getLogger(MenuServiceImpl.class);
	
	@Resource
	MenuDao menuDao;
	
	@Override
	public List<Menu> selectMenus() {
		return menuDao.selectUsers();
	}

	@Override
	public void createMenu(ZTreeWrapper zTreeWrapper) {
		logger.debug("###메뉴생성 재귀함수 호출###");
		for(ZTree zTree : zTreeWrapper.getzTrees()) {
			this.createMenuLoop(zTree);
		}
	}

	private void createMenuLoop(ZTree zTree) {
		logger.debug("###메뉴생성 재귀함수 실행###");
		logger.debug("1.메뉴 생성 : "+zTree.getName());
		logger.debug("2.메뉴의 자식 존재 여부 체크");
		logger.debug("	2-Y.자식 메뉴생성 재귀함수 호출");
		if(zTree.getChildren()!=null) {
			for(ZTree childZTree : zTree.getChildren()) {
				this.createMenuLoop(childZTree);
			}
		}
		logger.debug("3.메뉴 생성완료 : "+zTree.getName());
	}

	@Override
	public int deleteMenu() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
