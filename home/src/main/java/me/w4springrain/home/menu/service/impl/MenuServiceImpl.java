package me.w4springrain.home.menu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.w4springrain.home.menu.damain.Menu;
import me.w4springrain.home.menu.dao.MenuDao;
import me.w4springrain.home.menu.service.MenuService;

@Service("menuService")
public class MenuServiceImpl implements MenuService {

//	private static final Logger logger = LoggerFactory.getLogger(MenuServiceImpl.class);
	
	@Resource
	MenuDao menuDao;
	
	@Override
	public int createMenu(List<Menu> menus) {
		int resultCnt = 0;
		
		for(Menu menu : menus) {
			resultCnt += menuDao.createMenu(menu);
		}
		return resultCnt;
	}
	
	@Override
	public List<Menu> selectMenus() {
		return menuDao.selectUsers();
	}

}
