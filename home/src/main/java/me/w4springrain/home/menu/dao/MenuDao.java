package me.w4springrain.home.menu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me.w4springrain.home.menu.damain.Menu;

@Repository
public class MenuDao {
	
	@Autowired
	private SqlSession sqlSession;

	public List<Menu> selectUsers() {
		List<Menu> menus = sqlSession.selectList("menu.selectMenus");
		return menus;
	}
}
