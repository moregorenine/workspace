package me.w4springrain.home.menu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me.w4springrain.home.menu.damain.Menu;
import me.w4springrain.home.menu.damain.ZTree;

@Repository
public class MenuDao {
	
	@Autowired
	private SqlSession sqlSession;

	public int createMenu(Menu menu) {
		return sqlSession.insert("menus.createMenu", menu);
		
	}

	public int createMenu(ZTree zTree) {
		return sqlSession.insert("menus.createMenus", zTree);
	}
	
	public int deleteMenu() {
		return sqlSession.delete("menus.deleteMenu");
	}
	
	public List<Menu> selectUsers() {
		List<Menu> menus = sqlSession.selectList("menus.selectMenus");
		return menus;
	}
	
	public List<ZTree> selectMenus2ZTree() {
		List<ZTree> zTrees = sqlSession.selectList("menus.selectMenus2ZTree");
		return zTrees;
	}

	public int selectCurrvalSeq(String seqNm) {
		return sqlSession.selectOne("menus.selectCurrvalSeq", seqNm);
	}

	public int selectNextvalSeq(String seqNm) {
		return sqlSession.selectOne("menus.selectNextvalSeq", seqNm);
	}

}
