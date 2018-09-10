package me.w4springrain.home.menu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import me.w4springrain.home.menu.damain.Menu;
import me.w4springrain.home.menu.damain.ZTree;
import me.w4springrain.home.menu.dao.MenuDao;
import me.w4springrain.home.menu.service.MenuService;

@Service("menuService")
public class MenuServiceImpl implements MenuService {

	private static final Logger logger = LoggerFactory.getLogger(MenuServiceImpl.class);
	
	@Resource
	MenuDao menuDao;
	
	@Override
	public int createMenu(List<ZTree> zTrees) {
		int resultCnt = 0;
		for(ZTree zTree : zTrees) {
			logger.debug("zTree : ", zTree);
			//resultCnt += menuDao.createMenu(zTree);
		}
		return resultCnt;
	}
	
	@Override
	public List<Menu> selectMenus() {
		return menuDao.selectUsers();
	}

}
